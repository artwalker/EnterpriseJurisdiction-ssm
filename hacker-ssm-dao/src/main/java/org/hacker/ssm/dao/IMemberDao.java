package org.hacker.ssm.dao;

import org.apache.ibatis.annotations.Select;
import org.hacker.ssm.domain.Member;


/**
 * @author HackerStar
 * @create 2020-04-23 22:13
 */
public interface IMemberDao {
    @Select("select * from member where id = #{id}")
    public Member findById(String id);
}
