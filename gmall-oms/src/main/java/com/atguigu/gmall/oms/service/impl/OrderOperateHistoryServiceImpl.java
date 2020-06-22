package com.atguigu.gmall.oms.service.impl;

import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.java.core.bean.PageVo;
import com.java.core.bean.Query;
import com.java.core.bean.QueryCondition;

import com.atguigu.gmall.oms.dao.OrderOperateHistoryDao;
import com.atguigu.gmall.oms.entity.OrderOperateHistory;
import com.atguigu.gmall.oms.service.OrderOperateHistoryService;

@Service("orderOperateHistoryService")
public class OrderOperateHistoryServiceImpl extends ServiceImpl<OrderOperateHistoryDao, OrderOperateHistory> implements OrderOperateHistoryService {

    @Override
    public PageVo queryPage(QueryCondition params) {
        IPage<OrderOperateHistory> page = this.page(
                new Query<OrderOperateHistory>().getPage(params),
                new QueryWrapper<>()
        );

        return new PageVo(page);
    }

}