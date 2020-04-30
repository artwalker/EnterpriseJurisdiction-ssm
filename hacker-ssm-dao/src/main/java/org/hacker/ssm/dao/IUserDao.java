package org.hacker.ssm.dao;

import org.apache.ibatis.annotations.*;
import org.hacker.ssm.domain.Role;
import org.hacker.ssm.domain.UserInfo;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author HackerStar
 * @create 2020-04-24 11:41
 */
public interface IUserDao {
    @Select("select * from users where username=#{username}")
    @Results({
            @Result(property = "roles", column = "id", javaType = java.util.List.class, many = @Many(select = "org.hacker.ssm.dao.IRoleDao.findRoleByUserId"))
    })
    public UserInfo findByUsername(String username) throws Exception;

    @Select("select * from users")
    List<UserInfo> findAll();

    @Select("select * from users where id=#{userId}")
    UserInfo findById(String userId);

    @Select("select * from role where id  not in (select roleId from users_role where userId=#{userId})")
    List<Role> findOtherRoles(String userId);

    @Insert("insert into users(email,username,password,phoneNum,status) values(#{email},#{username},#{password},#{phoneNum},#{status})")
    void save(UserInfo userInfo);

    @Insert("insert into users_role(userId, roleId) values (#{userId},#{roleId})")
    void addRoleToUser(@Param("userId") String userId, @Param("roleId") String roleId);
}
