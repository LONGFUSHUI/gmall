package com.atguigu.gmall.pms.dao;

import com.atguigu.gmall.pms.entity.SkuSaleAttrValueEntity;
import java.util.List;

public interface SkuSaleAttrValueMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SkuSaleAttrValueEntity record);

    SkuSaleAttrValueEntity selectByPrimaryKey(Long id);

    List<SkuSaleAttrValueEntity> selectAll();

    int updateByPrimaryKey(SkuSaleAttrValueEntity record);
}