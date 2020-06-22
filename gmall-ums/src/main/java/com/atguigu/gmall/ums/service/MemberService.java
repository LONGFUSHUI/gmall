package com.atguigu.gmall.ums.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.gmall.ums.entity.Member;
import com.java.core.bean.PageVo;
import com.java.core.bean.QueryCondition;

/**
 * 会员
 *
 * @author liuzhanhong
 * @since  2020-06-22 17:29:47
 */
public interface MemberService extends IService<Member> {

    PageVo queryPage(QueryCondition params);
}

