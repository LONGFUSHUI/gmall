package com.atguigu.gmall.pms.dao;

import com.atguigu.gmall.pms.entity.BrandEntity;
import java.util.List;

public interface BrandMapper {
    int deleteByPrimaryKey(Long brandId);

    int insert(BrandEntity record);

    BrandEntity selectByPrimaryKey(Long brandId);

    List<BrandEntity> selectAll();

    int updateByPrimaryKey(BrandEntity record);
}