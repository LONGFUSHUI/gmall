package com.atguigu.gmall.oms.dao;

import com.atguigu.gmall.oms.entity.OrderOperateHistory;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单操作历史记录
 * @author liuzhanhong
 * @since  2020-06-22 17:16:49
 */
@Mapper
public interface OrderOperateHistoryDao extends BaseMapper<OrderOperateHistory> {
	
}
