package com.atguigu.gmall.ums.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.gmall.ums.entity.MemberLevel;
import com.java.core.bean.PageVo;
import com.java.core.bean.QueryCondition;

/**
 * 会员等级
 *
 * @author liuzhanhong
 * @since  2020-06-22 17:29:47
 */
public interface MemberLevelService extends IService<MemberLevel> {

    PageVo queryPage(QueryCondition params);
}

