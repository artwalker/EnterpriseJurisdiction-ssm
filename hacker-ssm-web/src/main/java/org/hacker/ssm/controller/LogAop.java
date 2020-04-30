package org.hacker.ssm.controller;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.hacker.ssm.domain.SysLog;
import org.hacker.ssm.service.ISysLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.lang.reflect.Method;
import java.util.Date;

/**
 * @author HackerStar
 * @create 2020-04-29 16:26
 */
@Component
@Aspect
public class LogAop {
    private Date startTime;//访问时间
    private Class executionClass;//访问的类
    private Method executionMethod;//访问的方法
    @Autowired
    private HttpServletRequest request;

    @Autowired
    private ISysLogService sysLogService;

    @Before("execution(* org.hacker.ssm.controller.*.*(..))")
    public void doBefore(JoinPoint jp) throws NoSuchMethodException {
        startTime = new Date();//访问的初始时间
        executionClass = jp.getTarget().getClass();//获取访问的类
        String methodName = jp.getSignature().getName();//获取访问的方法的名字
        Object[] args = jp.getArgs();//获取访问的方法的参数
        if (args == null || args.length == 0) {//方法没有参数
            executionMethod = executionClass.getMethod(methodName);//获取访问的方法
        } else {//方法有参数，将args元素遍历，获取对应的Class，装到Class数组中
            Class[] classArgs = new Class[args.length];
            for (int i = 0; i < args.length; i++) {
                classArgs[i] = args[i].getClass();//获取访问的方法
            }

            executionMethod = executionClass.getMethod(methodName, classArgs);
        }

    }

    @After("execution(* org.hacker.ssm.controller.*.*(..))")
    public void doAfter(JoinPoint jp) {
        //获取类上的@RequestMapping对象
        if (executionClass != SysLogController.class) {
            RequestMapping classAnnotation = (RequestMapping) executionClass.getAnnotation(RequestMapping.class);
            if (classAnnotation != null) {
                //获取方法上的@RequestMapping对象
                RequestMapping methodAnnotation = executionMethod.getAnnotation(RequestMapping.class);
                if (methodAnnotation != null) {
                    SysLog sysLog = new SysLog();//封装的实体类

                    String url = "";
                    //它的值应该是类上的@RequestMapping的value+方法上的@RequestMapping的value
                    url = classAnnotation.value()[0] + methodAnnotation.value()[0];
                    //获取访问时长
                    Long exectiontime = new Date().getTime() - startTime.getTime();
                    //获取ip
                    String ip = request.getRemoteAddr();
                    //获取用户名
                    SecurityContext context = SecurityContextHolder.getContext();
                    User principal = (User) context.getAuthentication().getPrincipal();
                    String username = principal.getUsername();

                    //将sysLog对象属性封装
                    sysLog.setVisitTime(startTime);
                    sysLog.setExecutionTime(exectiontime);
                    sysLog.setUsername(username);
                    sysLog.setMethod("[类名]" + executionClass.getName() + "[方法名]" + executionMethod.getName());
                    sysLog.setIp(ip);
                    sysLog.setUrl(url);

                    //将访问记录实体类保存到数据库
                    sysLogService.save(sysLog);
                }
            }
        }
    }
}
