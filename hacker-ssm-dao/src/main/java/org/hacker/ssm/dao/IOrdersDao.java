package org.hacker.ssm.dao;

import org.apache.ibatis.annotations.*;
import org.hacker.ssm.domain.Member;
import org.hacker.ssm.domain.Orders;
import org.hacker.ssm.domain.Product;

import java.util.List;

/**
 * @author HackerStar
 * @create 2020-04-22 11:50
 */
public interface IOrdersDao {
    @Select("select * from orders")
    @Results({
            @Result(column = "productId", property = "product", javaType = Product.class, one = @One(select = "org.hacker.ssm.dao.IProductDao.findById"))
    })
    public List<Orders> findAll();

    @Select("select * from orders where id = #{ordersId}")
    @Results({
            @Result(property = "product", column = "productId", javaType = Product.class, one = @One(select = "org.hacker.ssm.dao.IProductDao.findById")),
            @Result(property = "member", column = "memberId", javaType = Member.class, one = @One(select = "org.hacker.ssm.dao.IMemberDao.findById")),
            @Result(property = "travellers", column = "id", javaType = java.util.List.class, many = @Many(select = "org.hacker.ssm.dao.ITravellerDao.findByOrdersId"))
    })
    public Orders findById(String ordersId);
}
