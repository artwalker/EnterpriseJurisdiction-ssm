package org.hacker.ssm.service.impl;

import org.hacker.ssm.dao.IUserDao;
import org.hacker.ssm.domain.Role;
import org.hacker.ssm.domain.UserInfo;
import org.hacker.ssm.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/**
 * @author HackerStar
 * @create 2020-04-24 11:34
 */
@Service("userService")
@Transactional
public class UserServiceImpl implements IUserService {

    @Autowired
    private IUserDao userDao;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserInfo userInfo = null;
        try {
            userInfo = userDao.findByUsername(username);
        } catch (Exception e) {
            e.printStackTrace();
        }
        List<Role> roles = userInfo.getRoles();
        //处理自己的用户对象封装成UserDetails
        User user = new User(userInfo.getUsername(), "{noop}" + userInfo.getPassword(), userInfo.getStatus() == 0 ? false : true, true, true, true, getAuthority(roles));
        return user;
    }

    //作用就是返回一个List集合，集合中装入的是权限描述
    public List<SimpleGrantedAuthority> getAuthority(List<Role> roles) {

        List<SimpleGrantedAuthority> list = new ArrayList<>();
        for (Role role : roles) {
            list.add(new SimpleGrantedAuthority("ROLE_" + role.getRoleName()));
        }
        return list;
    }

    @Override
    public List<UserInfo> findAll() {
        return userDao.findAll();
    }

    //根据ID查询用户的信息
    @Override
    public UserInfo findById(String userId) {
        return userDao.findById(userId);
    }

    //返回用户未添加的角色
    @Override
    public List<Role> findOtherRoles(String userId) {
        return userDao.findOtherRoles(userId);
    }

    @Override
    public void save(UserInfo userInfo) {
        userDao.save(userInfo);
    }

    @Override
    public void addRoleToUser(String userId, String[] roleIds) {
        for (String roleId :
                roleIds) {
            userDao.addRoleToUser(userId, roleId);
        }
    }
}
