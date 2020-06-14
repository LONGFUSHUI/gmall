package com.atguigu.gmall.pms.dao;

import com.atguigu.gmall.pms.entity.SpuImagesEntity;
import java.util.List;

public interface SpuImagesMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SpuImagesEntity record);

    SpuImagesEntity selectByPrimaryKey(Long id);

    List<SpuImagesEntity> selectAll();

    int updateByPrimaryKey(SpuImagesEntity record);
}