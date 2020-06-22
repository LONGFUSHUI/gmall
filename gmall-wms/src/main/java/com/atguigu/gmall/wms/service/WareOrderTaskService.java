package com.atguigu.gmall.wms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.gmall.wms.entity.WareOrderTask;
import com.java.core.bean.PageVo;
import com.java.core.bean.QueryCondition;

/**
 * 库存工作单
 *
 * @author liuzhanhong
 * @since  2020-06-22 17:30:59
 */
public interface WareOrderTaskService extends IService<WareOrderTask> {

    PageVo queryPage(QueryCondition params);
}

