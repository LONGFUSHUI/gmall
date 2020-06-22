package com.atguigu.gmall.sms.dao;

import com.atguigu.gmall.sms.entity.MemberPrice;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品会员价格
 * @author liuzhanhong
 * @since  2020-06-22 17:18:28
 */
@Mapper
public interface MemberPriceDao extends BaseMapper<MemberPrice> {
	
}
