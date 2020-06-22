package com.atguigu.gmall.wms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.gmall.wms.entity.WareInfo;
import com.java.core.bean.PageVo;
import com.java.core.bean.QueryCondition;

/**
 * 仓库信息
 *
 * @author liuzhanhong
 * @since  2020-06-22 17:30:59
 */
public interface WareInfoService extends IService<WareInfo> {

    PageVo queryPage(QueryCondition params);
}

