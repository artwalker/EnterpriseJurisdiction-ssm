package org.hacker.ssm.service;

import org.hacker.ssm.domain.Role;
import org.hacker.ssm.domain.UserInfo;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;

/**
 * @author HackerStar
 * @create 2020-04-24 11:34
 */
public interface IUserService extends UserDetailsService {
    List<UserInfo> findAll();

    UserInfo findById(String userId);

    List<Role> findOtherRoles(String userId);

    void save(UserInfo userInfo);

    void addRoleToUser(String userId, String[] roleIds);
}
