package org.hacker.ssm.service;

        import org.hacker.ssm.domain.Orders;

        import java.util.List;

/**
 * @author HackerStar
 * @create 2020-04-22 11:44
 */
public interface IOrdersService {
    //从订单数据库查询数据
    List<Orders> findAll();

    //分页
    List<Orders> findAll(int page, int pageSize);

    Orders findById(String ordersId) throws Exception;
}
