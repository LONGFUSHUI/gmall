package com.atguigu.gmall.oms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.gmall.oms.entity.OrderReturnReason;
import com.java.core.bean.PageVo;
import com.java.core.bean.QueryCondition;

/**
 * 退货原因
 *
 * @author liuzhanhong
 * @since  2020-06-22 17:16:49
 */
public interface OrderReturnReasonService extends IService<OrderReturnReason> {

    PageVo queryPage(QueryCondition params);
}

