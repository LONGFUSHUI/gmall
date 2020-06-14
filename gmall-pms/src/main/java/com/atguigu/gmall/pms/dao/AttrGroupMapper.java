package com.atguigu.gmall.pms.dao;

import com.atguigu.gmall.pms.entity.AttrGroupEntity;
import java.util.List;

public interface AttrGroupMapper {
    int deleteByPrimaryKey(Long attrGroupId);

    int insert(AttrGroupEntity record);

    AttrGroupEntity selectByPrimaryKey(Long attrGroupId);

    List<AttrGroupEntity> selectAll();

    int updateByPrimaryKey(AttrGroupEntity record);
}