package com.atguigu.gmall.sms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.gmall.sms.entity.CouponSpuRelation;
import com.java.core.bean.PageVo;
import com.java.core.bean.QueryCondition;

/**
 * 优惠券与产品关联
 *
 * @author liuzhanhong
 * @since  2020-06-22 17:18:28
 */
public interface CouponSpuRelationService extends IService<CouponSpuRelation> {

    PageVo queryPage(QueryCondition params);
}

