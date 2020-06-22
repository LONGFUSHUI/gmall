package com.atguigu.gmall.oms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.gmall.oms.entity.OrderOperateHistory;
import com.java.core.bean.PageVo;
import com.java.core.bean.QueryCondition;

/**
 * 订单操作历史记录
 *
 * @author liuzhanhong
 * @since  2020-06-22 17:16:49
 */
public interface OrderOperateHistoryService extends IService<OrderOperateHistory> {

    PageVo queryPage(QueryCondition params);
}

