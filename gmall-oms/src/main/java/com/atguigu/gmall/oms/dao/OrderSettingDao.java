package com.atguigu.gmall.oms.dao;

import com.atguigu.gmall.oms.entity.OrderSetting;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单配置信息
 * @author liuzhanhong
 * @since  2020-06-22 17:16:49
 */
@Mapper
public interface OrderSettingDao extends BaseMapper<OrderSetting> {
	
}
