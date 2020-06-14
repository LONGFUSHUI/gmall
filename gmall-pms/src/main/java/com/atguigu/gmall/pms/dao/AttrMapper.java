package com.atguigu.gmall.pms.dao;

import com.atguigu.gmall.pms.entity.AttrEntity;
import java.util.List;

public interface AttrMapper {
    int deleteByPrimaryKey(Long attrId);

    int insert(AttrEntity record);

    AttrEntity selectByPrimaryKey(Long attrId);

    List<AttrEntity> selectAll();

    int updateByPrimaryKey(AttrEntity record);
}