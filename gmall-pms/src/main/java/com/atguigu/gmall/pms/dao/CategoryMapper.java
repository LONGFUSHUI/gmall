package com.atguigu.gmall.pms.dao;

import com.atguigu.gmall.pms.entity.CategoryEntity;
import java.util.List;

public interface CategoryMapper {
    int deleteByPrimaryKey(Long catId);

    int insert(CategoryEntity record);

    CategoryEntity selectByPrimaryKey(Long catId);

    List<CategoryEntity> selectAll();

    int updateByPrimaryKey(CategoryEntity record);
}