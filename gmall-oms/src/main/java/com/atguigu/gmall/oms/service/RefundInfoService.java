package com.atguigu.gmall.oms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.gmall.oms.entity.RefundInfo;
import com.java.core.bean.PageVo;
import com.java.core.bean.QueryCondition;

/**
 * 退款信息
 *
 * @author liuzhanhong
 * @since  2020-06-22 17:16:49
 */
public interface RefundInfoService extends IService<RefundInfo> {

    PageVo queryPage(QueryCondition params);
}

