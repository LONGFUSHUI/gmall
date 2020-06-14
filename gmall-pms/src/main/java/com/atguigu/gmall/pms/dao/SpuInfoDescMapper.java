package com.atguigu.gmall.pms.dao;

import com.atguigu.gmall.pms.entity.SpuInfoDescEntity;
import java.util.List;

public interface SpuInfoDescMapper {
    int deleteByPrimaryKey(Long spuId);

    int insert(SpuInfoDescEntity record);

    SpuInfoDescEntity selectByPrimaryKey(Long spuId);

    List<SpuInfoDescEntity> selectAll();

    int updateByPrimaryKey(SpuInfoDescEntity record);
}