package com.atguigu.gmall.pms.dao;

import com.atguigu.gmall.pms.entity.SkuImagesEntity;
import java.util.List;

public interface SkuImagesMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SkuImagesEntity record);

    SkuImagesEntity selectByPrimaryKey(Long id);

    List<SkuImagesEntity> selectAll();

    int updateByPrimaryKey(SkuImagesEntity record);
}