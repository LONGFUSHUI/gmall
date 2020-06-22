package com.atguigu.gmall.wms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.gmall.wms.entity.WareOrderTaskDetail;
import com.java.core.bean.PageVo;
import com.java.core.bean.QueryCondition;

/**
 * 库存工作单
 *
 * @author liuzhanhong
 * @since  2020-06-22 17:30:59
 */
public interface WareOrderTaskDetailService extends IService<WareOrderTaskDetail> {

    PageVo queryPage(QueryCondition params);
}

