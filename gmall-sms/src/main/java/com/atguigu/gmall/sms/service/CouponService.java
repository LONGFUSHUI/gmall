package com.atguigu.gmall.sms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.gmall.sms.entity.Coupon;
import com.java.core.bean.PageVo;
import com.java.core.bean.QueryCondition;

/**
 * 优惠券信息
 *
 * @author liuzhanhong
 * @since  2020-06-22 17:18:28
 */
public interface CouponService extends IService<Coupon> {

    PageVo queryPage(QueryCondition params);
}

