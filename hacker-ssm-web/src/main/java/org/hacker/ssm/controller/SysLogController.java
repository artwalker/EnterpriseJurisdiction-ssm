package org.hacker.ssm.controller;

import org.hacker.ssm.domain.SysLog;
import org.hacker.ssm.service.ISysLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * @author HackerStar
 * @create 2020-04-29 16:37
 */
@RequestMapping("/sysLog")
@Controller
public class SysLogController {
    @Autowired
    private ISysLogService sysLogService;

    @RequestMapping("/findAll.do")
    public ModelAndView findAll() {
        ModelAndView mv = new ModelAndView();
        List<SysLog> sysLogs = sysLogService.findAll();
        mv.addObject("sysLogs", sysLogs);
        mv.setViewName("sysLog-list");
        return mv;
    }
}
