package com.atguigu.gmall.pms.dao;

import com.atguigu.gmall.pms.entity.ProductAttrValueEntity;
import java.util.List;

public interface ProductAttrValueMapper {
    int deleteByPrimaryKey(Long id);

    int insert(ProductAttrValueEntity record);

    ProductAttrValueEntity selectByPrimaryKey(Long id);

    List<ProductAttrValueEntity> selectAll();

    int updateByPrimaryKey(ProductAttrValueEntity record);
}