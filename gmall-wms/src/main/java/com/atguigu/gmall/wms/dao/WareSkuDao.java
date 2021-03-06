package com.atguigu.gmall.wms.dao;

import com.atguigu.gmall.wms.entity.WareSku;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品库存
 * @author liuzhanhong
 * @since  2020-06-22 17:30:59
 */
@Mapper
public interface WareSkuDao extends BaseMapper<WareSku> {
	
}
