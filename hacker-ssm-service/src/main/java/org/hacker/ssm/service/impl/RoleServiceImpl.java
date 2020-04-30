package org.hacker.ssm.service.impl;

        import org.hacker.ssm.dao.IRoleDao;
        import org.hacker.ssm.domain.Permission;
        import org.hacker.ssm.domain.Role;
        import org.hacker.ssm.service.IRoleService;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.stereotype.Service;
        import org.springframework.transaction.annotation.Transactional;

        import java.util.List;

/**
 * @author HackerStar
 * @create 2020-04-27 00:33
 */
@Service
@Transactional
public class RoleServiceImpl implements IRoleService {
    @Autowired
    private IRoleDao roleDao;

    @Override
    public List<Role> findAll() {
        return roleDao.findAll();
    }

    @Override
    public void save(Role role) {
        roleDao.sava(role);
    }

    @Override
    public Role findById(String roleId) {
        return roleDao.findById(roleId);
    }

    @Override
    public List<Permission> findOtherPermission(String roleId) {
        return roleDao.findOtherPermission(roleId);
    }
}
