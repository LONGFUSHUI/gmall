package com.atguigu.gmall.pms.dao;

import com.atguigu.gmall.pms.entity.CommentReplayEntity;
import java.util.List;

public interface CommentReplayMapper {
    int deleteByPrimaryKey(Long id);

    int insert(CommentReplayEntity record);

    CommentReplayEntity selectByPrimaryKey(Long id);

    List<CommentReplayEntity> selectAll();

    int updateByPrimaryKey(CommentReplayEntity record);
}