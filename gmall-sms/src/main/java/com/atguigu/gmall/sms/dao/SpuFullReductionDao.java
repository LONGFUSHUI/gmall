package com.atguigu.gmall.sms.dao;

import com.atguigu.gmall.sms.entity.SpuFullReduction;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品满减信息
 * @author liuzhanhong
 * @since  2020-06-22 17:18:28
 */
@Mapper
public interface SpuFullReductionDao extends BaseMapper<SpuFullReduction> {
	
}
