package com.atguigu.gmall.ums.dao;

import com.atguigu.gmall.ums.entity.Member;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * @author liuzhanhong
 * @since  2020-06-22 17:29:47
 */
@Mapper
public interface MemberDao extends BaseMapper<Member> {
	
}
