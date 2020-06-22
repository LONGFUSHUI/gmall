package com.atguigu.gmall.oms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.gmall.oms.entity.PaymentInfo;
import com.java.core.bean.PageVo;
import com.java.core.bean.QueryCondition;

/**
 * 支付信息表
 *
 * @author liuzhanhong
 * @since  2020-06-22 17:16:49
 */
public interface PaymentInfoService extends IService<PaymentInfo> {

    PageVo queryPage(QueryCondition params);
}

