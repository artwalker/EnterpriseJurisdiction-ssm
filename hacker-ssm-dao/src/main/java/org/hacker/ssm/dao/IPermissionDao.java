package org.hacker.ssm.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.hacker.ssm.domain.Permission;

import java.util.List;

/**
 * @author HackerStar
 * @create 2020-04-27 13:18
 */
public interface IPermissionDao {
    @Select("select * from permission")
    public List<Permission> findAll();

    @Insert("insert into permission(permissionName, url) values (#{permissionName}, #{url})")
    void save(Permission permission);

    @Select("select * from permission where id=#{roleId}")
    Permission findPermissionByRoleId(String roleId);
}
