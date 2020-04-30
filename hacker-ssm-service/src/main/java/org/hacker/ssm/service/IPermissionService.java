package org.hacker.ssm.service;

        import org.hacker.ssm.domain.Permission;

        import java.util.List;

/**
 * @author HackerStar
 * @create 2020-04-27 13:15
 */
public interface IPermissionService {
    public List<Permission> findAll();

    void save(Permission permission);
}
