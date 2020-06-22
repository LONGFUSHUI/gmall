package com.atguigu.gmall.pms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.gmall.pms.entity.SpuImages;
import com.java.core.bean.PageVo;
import com.java.core.bean.QueryCondition;

/**
 * spu图片
 *
 * @author liuzhanhong
 * @since  2020-06-22 16:45:43
 */
public interface SpuImagesService extends IService<SpuImages> {

    PageVo queryPage(QueryCondition params);
}

