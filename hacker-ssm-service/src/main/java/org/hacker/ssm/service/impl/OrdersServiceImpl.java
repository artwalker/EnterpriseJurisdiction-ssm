package org.hacker.ssm.service.impl;

import com.github.pagehelper.PageHelper;
import com.sun.glass.ui.Size;
import org.hacker.ssm.dao.IOrdersDao;
import org.hacker.ssm.domain.Orders;
import org.hacker.ssm.service.IOrdersService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author HackerStar
 * @create 2020-04-22 11:45
 */
@Service
@Transactional
public class OrdersServiceImpl implements IOrdersService {

    @Autowired
    private IOrdersDao ordersDao;

    @Override
    public List<Orders> findAll() {
        return ordersDao.findAll();
    }

    @Override
    public List<Orders> findAll(int page, int pageSize) {
        //pag是第几页， size是每页显示几条数据
        PageHelper.startPage(page, pageSize);
        return ordersDao.findAll();
    }

    @Override
    public Orders findById(String ordersId) throws Exception{
        return ordersDao.findById(ordersId);
    }
}
