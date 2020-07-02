package com.atguigu.gmall.pms.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.java.core.bean.PageVo;
import com.java.core.bean.Query;
import com.java.core.bean.QueryCondition;

import com.atguigu.gmall.pms.dao.AttrGroupDao;
import com.atguigu.gmall.pms.entity.AttrGroup;
import com.atguigu.gmall.pms.service.AttrGroupService;

@Service("attrGroupService")
public class AttrGroupServiceImpl extends ServiceImpl<AttrGroupDao, AttrGroup> implements AttrGroupService {

    @Override
    public PageVo queryPage(QueryCondition params) {
        IPage<AttrGroup> page = this.page(
                new Query<AttrGroup>().getPage(params),
                new QueryWrapper<>()
        );

//        IPage<AttrGroup> groupPage = new Page<>(1,2);
//
//        QueryWrapper<AttrGroup> wrapper = new QueryWrapper<>();
//
//        IPage<AttrGroup> page1 = this.page(groupPage, wrapper);

//        this.page(groupPage);


        return new PageVo(page);
    }

    @Override
    public PageVo queryGroupByPage(QueryCondition queryCondition, Long catId) {

        IPage<AttrGroup> page = this.page(new Query<AttrGroup>().getPage(queryCondition), new QueryWrapper<AttrGroup>());

        return null;
    }

}