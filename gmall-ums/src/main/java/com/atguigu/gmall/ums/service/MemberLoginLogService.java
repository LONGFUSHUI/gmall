package com.atguigu.gmall.ums.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.gmall.ums.entity.MemberLoginLog;
import com.java.core.bean.PageVo;
import com.java.core.bean.QueryCondition;

/**
 * 会员登录记录
 *
 * @author liuzhanhong
 * @since  2020-06-22 17:29:47
 */
public interface MemberLoginLogService extends IService<MemberLoginLog> {

    PageVo queryPage(QueryCondition params);
}

