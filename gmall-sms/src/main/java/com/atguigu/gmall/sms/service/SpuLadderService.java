package com.atguigu.gmall.sms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.gmall.sms.entity.SpuLadder;
import com.java.core.bean.PageVo;
import com.java.core.bean.QueryCondition;

/**
 * 商品阶梯价格
 *
 * @author liuzhanhong
 * @since  2020-06-22 17:18:28
 */
public interface SpuLadderService extends IService<SpuLadder> {

    PageVo queryPage(QueryCondition params);
}

