package com.atguigu.gmall.wms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.gmall.wms.entity.WareSku;
import com.java.core.bean.PageVo;
import com.java.core.bean.QueryCondition;

/**
 * 商品库存
 *
 * @author liuzhanhong
 * @since  2020-06-22 17:30:59
 */
public interface WareSkuService extends IService<WareSku> {

    PageVo queryPage(QueryCondition params);
}

