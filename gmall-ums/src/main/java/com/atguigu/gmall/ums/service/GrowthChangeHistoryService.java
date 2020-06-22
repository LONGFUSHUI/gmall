package com.atguigu.gmall.ums.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.gmall.ums.entity.GrowthChangeHistory;
import com.java.core.bean.PageVo;
import com.java.core.bean.QueryCondition;

/**
 * 成长值变化历史记录
 *
 * @author liuzhanhong
 * @since  2020-06-22 17:29:47
 */
public interface GrowthChangeHistoryService extends IService<GrowthChangeHistory> {

    PageVo queryPage(QueryCondition params);
}

