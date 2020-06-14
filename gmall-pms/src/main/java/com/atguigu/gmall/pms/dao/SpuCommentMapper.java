package com.atguigu.gmall.pms.dao;

import com.atguigu.gmall.pms.entity.SpuCommentEntity;
import java.util.List;

public interface SpuCommentMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SpuCommentEntity record);

    SpuCommentEntity selectByPrimaryKey(Long id);

    List<SpuCommentEntity> selectAll();

    int updateByPrimaryKey(SpuCommentEntity record);
}