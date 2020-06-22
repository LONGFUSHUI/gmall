package com.atguigu.gmall.oms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.gmall.oms.entity.OrderReturnApply;
import com.java.core.bean.PageVo;
import com.java.core.bean.QueryCondition;

/**
 * 订单退货申请
 *
 * @author liuzhanhong
 * @since  2020-06-22 17:16:49
 */
public interface OrderReturnApplyService extends IService<OrderReturnApply> {

    PageVo queryPage(QueryCondition params);
}

