package com.atguigu.gmall.pms.dao;

import com.atguigu.gmall.pms.entity.CommentReplay;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品评价回复关系
 * @author liuzhanhong
 * @since  2020-06-22 16:45:43
 */
@Mapper
public interface CommentReplayDao extends BaseMapper<CommentReplay> {
	
}
