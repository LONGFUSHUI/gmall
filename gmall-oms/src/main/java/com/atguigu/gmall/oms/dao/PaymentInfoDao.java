package com.atguigu.gmall.oms.dao;

import com.atguigu.gmall.oms.entity.PaymentInfo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 支付信息表
 * @author liuzhanhong
 * @since  2020-06-22 17:16:49
 */
@Mapper
public interface PaymentInfoDao extends BaseMapper<PaymentInfo> {
	
}
