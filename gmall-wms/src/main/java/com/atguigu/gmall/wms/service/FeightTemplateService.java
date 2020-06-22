package com.atguigu.gmall.wms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.gmall.wms.entity.FeightTemplate;
import com.java.core.bean.PageVo;
import com.java.core.bean.QueryCondition;

/**
 * 运费模板
 *
 * @author liuzhanhong
 * @since  2020-06-22 17:30:59
 */
public interface FeightTemplateService extends IService<FeightTemplate> {

    PageVo queryPage(QueryCondition params);
}

