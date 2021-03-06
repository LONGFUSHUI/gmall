package com.atguigu.gmall.oms.dao;

import com.atguigu.gmall.oms.entity.OrderReturnReason;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 退货原因
 * @author liuzhanhong
 * @since  2020-06-22 17:16:49
 */
@Mapper
public interface OrderReturnReasonDao extends BaseMapper<OrderReturnReason> {
	
}
