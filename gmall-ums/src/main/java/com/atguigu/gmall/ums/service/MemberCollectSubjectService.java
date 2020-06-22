package com.atguigu.gmall.ums.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.gmall.ums.entity.MemberCollectSubject;
import com.java.core.bean.PageVo;
import com.java.core.bean.QueryCondition;

/**
 * 会员收藏的专题活动
 *
 * @author liuzhanhong
 * @since  2020-06-22 17:29:47
 */
public interface MemberCollectSubjectService extends IService<MemberCollectSubject> {

    PageVo queryPage(QueryCondition params);
}

