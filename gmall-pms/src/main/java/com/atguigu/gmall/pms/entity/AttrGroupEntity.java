package com.atguigu.gmall.pms.entity;

import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ApiModel
public class AttrGroupEntity implements Serializable {
    private Long attrGroupId;

    private String attrGroupName;

    private Integer sort;

    private String descript;

    private String icon;

    private Long catelogId;

    private static final long serialVersionUID = 1L;

}