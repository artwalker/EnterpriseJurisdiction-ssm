package org.hacker.ssm.service;

import org.hacker.ssm.domain.SysLog;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author HackerStar
 * @create 2020-04-29 16:41
 */
public interface ISysLogService {

    public List<SysLog> findAll();

    void save(SysLog sysLog);
}
