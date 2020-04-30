package org.hacker.ssm.service;

import org.hacker.ssm.domain.Product;

import java.util.List;

/**
 * @author HackerStar
 * @create 2020-04-20 10:46
 */
public interface IProductService {

    //从数据库查询所有商品
    List<Product> findAll() throws Exception;

    //添加商品
    void save(Product product) throws Exception;
}
