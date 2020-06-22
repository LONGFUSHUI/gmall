package com.atguigu.gmall.ums.dao;

import com.atguigu.gmall.ums.entity.IntegrationChangeHistory;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 积分变化历史记录
 * @author liuzhanhong
 * @since  2020-06-22 17:29:47
 */
@Mapper
public interface IntegrationChangeHistoryDao extends BaseMapper<IntegrationChangeHistory> {
	
}
