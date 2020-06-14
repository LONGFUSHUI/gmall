package com.atguigu.gmall.pms.dao;

import com.atguigu.gmall.pms.entity.SkuInfoEntity;
import java.util.List;

public interface SkuInfoMapper {
    int deleteByPrimaryKey(Long skuId);

    int insert(SkuInfoEntity record);

    SkuInfoEntity selectByPrimaryKey(Long skuId);

    List<SkuInfoEntity> selectAll();

    int updateByPrimaryKey(SkuInfoEntity record);
}