package com.atguigu.gmall.wms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.gmall.wms.entity.ShArea;
import com.java.core.bean.PageVo;
import com.java.core.bean.QueryCondition;

/**
 * 全国省市区信息
 *
 * @author liuzhanhong
 * @since  2020-06-22 17:30:59
 */
public interface ShAreaService extends IService<ShArea> {

    PageVo queryPage(QueryCondition params);
}

