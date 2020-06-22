package com.atguigu.gmall.sms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.gmall.sms.entity.SeckillSkuNotice;
import com.java.core.bean.PageVo;
import com.java.core.bean.QueryCondition;

/**
 * 秒杀商品通知订阅
 *
 * @author liuzhanhong
 * @since  2020-06-22 17:18:28
 */
public interface SeckillSkuNoticeService extends IService<SeckillSkuNotice> {

    PageVo queryPage(QueryCondition params);
}

