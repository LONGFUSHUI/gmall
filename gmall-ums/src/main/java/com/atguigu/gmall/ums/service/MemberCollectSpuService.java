package com.atguigu.gmall.ums.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.gmall.ums.entity.MemberCollectSpu;
import com.java.core.bean.PageVo;
import com.java.core.bean.QueryCondition;

/**
 * 会员收藏的商品
 *
 * @author liuzhanhong
 * @since  2020-06-22 17:29:47
 */
public interface MemberCollectSpuService extends IService<MemberCollectSpu> {

    PageVo queryPage(QueryCondition params);
}

