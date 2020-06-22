package com.atguigu.gmall.sms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.gmall.sms.entity.HomeSubjectSpu;
import com.java.core.bean.PageVo;
import com.java.core.bean.QueryCondition;

/**
 * 专题商品
 *
 * @author liuzhanhong
 * @since  2020-06-22 17:18:28
 */
public interface HomeSubjectSpuService extends IService<HomeSubjectSpu> {

    PageVo queryPage(QueryCondition params);
}

