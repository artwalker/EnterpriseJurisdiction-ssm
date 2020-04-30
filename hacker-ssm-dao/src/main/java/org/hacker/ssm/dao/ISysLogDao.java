package org.hacker.ssm.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.hacker.ssm.domain.SysLog;

import java.util.List;

/**
 * @author HackerStar
 * @create 2020-04-29 16:43
 */
public interface ISysLogDao {

    @Select("select * from sysLog")
    List<SysLog> findAll();

    @Insert("insert into syslog(visitTime,username,ip,url,executionTime,method) values(#{visitTime},#{username},#{ip},#{url},#{executionTime},#{method})")
    void save(SysLog sysLog);
}
