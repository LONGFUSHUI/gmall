package com.atguigu.gmall.sms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.gmall.sms.entity.SpuBounds;
import com.java.core.bean.PageVo;
import com.java.core.bean.QueryCondition;

/**
 * 商品spu积分设置
 *
 * @author liuzhanhong
 * @since  2020-06-22 17:18:28
 */
public interface SpuBoundsService extends IService<SpuBounds> {

    PageVo queryPage(QueryCondition params);
}

