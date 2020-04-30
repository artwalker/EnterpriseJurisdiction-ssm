package org.hacker.ssm.service;

import org.hacker.ssm.domain.Permission;
import org.hacker.ssm.domain.Role;

import java.util.List;

/**
 * @author HackerStar
 * @create 2020-04-27 00:32
 */
public interface IRoleService {
    public List<Role> findAll();

    void save(Role role);

    Role findById(String roleId);

    List<Permission> findOtherPermission(String roleId);
}
