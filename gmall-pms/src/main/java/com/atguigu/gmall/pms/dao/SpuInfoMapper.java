package com.atguigu.gmall.pms.dao;

import com.atguigu.gmall.pms.entity.SpuInfoEntity;
import java.util.List;

public interface SpuInfoMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SpuInfoEntity record);

    SpuInfoEntity selectByPrimaryKey(Long id);

    List<SpuInfoEntity> selectAll();

    int updateByPrimaryKey(SpuInfoEntity record);
}