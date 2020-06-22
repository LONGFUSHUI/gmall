package com.atguigu.gmall.pms.dao;

import com.atguigu.gmall.pms.entity.Category;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * @author liuzhanhong
 * @since  2020-06-22 16:45:43
 */
@Mapper
public interface CategoryDao extends BaseMapper<Category> {
	
}
