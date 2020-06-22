package com.atguigu.gmall.ums.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.gmall.ums.entity.IntegrationChangeHistory;
import com.java.core.bean.PageVo;
import com.java.core.bean.QueryCondition;

/**
 * 积分变化历史记录
 *
 * @author liuzhanhong
 * @since  2020-06-22 17:29:47
 */
public interface IntegrationChangeHistoryService extends IService<IntegrationChangeHistory> {

    PageVo queryPage(QueryCondition params);
}

