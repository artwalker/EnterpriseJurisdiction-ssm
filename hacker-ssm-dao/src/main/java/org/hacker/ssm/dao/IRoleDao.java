package org.hacker.ssm.dao;

import org.apache.ibatis.annotations.*;
import org.hacker.ssm.domain.Permission;
import org.hacker.ssm.domain.Role;

import java.util.List;

/**
 * @author HackerStar
 * @create 2020-04-24 11:43
 */
public interface IRoleDao {
    //根据用户id查询出所有对应的权限
    @Select("select * from role where id in (select roleId from users_role where userId=#{userId})")
    public List<Role> findRoleByUserId(String userId) throws Exception;

    @Select("select * from role")
    List<Role> findAll();

    @Insert("insert into role(roleName, roleDesc) values (#{roleName},#{roleDesc})")
    void sava(Role role);

    @Select("select * from role where roleId = #{roleId}")
    @Results({
            @Result(property = "permissions", column = "id", javaType = java.util.List.class, many = @Many(select = "org.hacker.ssm.dao.IPermissionDao.findPermissionByRoleId"))
    })
    Role findById(String roleId);

    @Select("select * from permission where id not in (select permissionId from role_permission where roleId=#{roleId})")
    List<Permission> findOtherPermission(String roleId);
}
