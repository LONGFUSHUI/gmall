package com.atguigu.gmall.pms.dao;

import com.atguigu.gmall.pms.entity.AttrAttrgroupRelationEntity;
import java.util.List;

public interface AttrAttrgroupRelationMapper {
    int deleteByPrimaryKey(Long id);

    int insert(AttrAttrgroupRelationEntity record);

    AttrAttrgroupRelationEntity selectByPrimaryKey(Long id);

    List<AttrAttrgroupRelationEntity> selectAll();

    int updateByPrimaryKey(AttrAttrgroupRelationEntity record);
}