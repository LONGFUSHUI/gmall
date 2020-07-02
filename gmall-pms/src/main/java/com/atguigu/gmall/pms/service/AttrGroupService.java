package com.atguigu.gmall.pms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.gmall.pms.entity.AttrGroup;
import com.java.core.bean.PageVo;
import com.java.core.bean.QueryCondition;

/**
 * 属性分组
 *
 * @author liuzhanhong
 * @since  2020-06-22 16:45:43
 */
public interface AttrGroupService extends IService<AttrGroup> {

    PageVo queryPage(QueryCondition params);

    PageVo queryGroupByPage(QueryCondition queryCondition, Long catId);
}

