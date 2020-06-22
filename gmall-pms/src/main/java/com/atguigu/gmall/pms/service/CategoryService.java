package com.atguigu.gmall.pms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.gmall.pms.entity.Category;
import com.java.core.bean.PageVo;
import com.java.core.bean.QueryCondition;

/**
 * 商品三级分类
 *
 * @author liuzhanhong
 * @since  2020-06-22 16:45:43
 */
public interface CategoryService extends IService<Category> {

    PageVo queryPage(QueryCondition params);
}

