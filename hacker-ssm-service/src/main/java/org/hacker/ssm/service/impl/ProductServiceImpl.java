package org.hacker.ssm.service.impl;

import org.hacker.ssm.dao.IProductDao;
import org.hacker.ssm.domain.Product;
import org.hacker.ssm.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author HackerStar
 * @create 2020-04-20 10:47
 */
@Service
@Transactional
public class ProductServiceImpl implements IProductService {
    @Autowired
    private IProductDao productDao;

    @Override
    public List<Product> findAll() throws Exception {
        return productDao.findAll();
    }

    @Override
    public void save(Product product) throws Exception{
        productDao.save(product);
    }
}
