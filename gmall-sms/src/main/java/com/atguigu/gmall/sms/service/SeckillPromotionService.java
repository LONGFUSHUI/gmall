package com.atguigu.gmall.sms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.gmall.sms.entity.SeckillPromotion;
import com.java.core.bean.PageVo;
import com.java.core.bean.QueryCondition;

/**
 * 秒杀活动
 *
 * @author liuzhanhong
 * @since  2020-06-22 17:18:28
 */
public interface SeckillPromotionService extends IService<SeckillPromotion> {

    PageVo queryPage(QueryCondition params);
}

