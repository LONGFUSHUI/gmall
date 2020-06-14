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
public class AttrEntity implements Serializable {
    private Long attrId;

    private String attrName;

    private Byte searchType;

    private Byte valueType;

    private String icon;

    private String valueSelect;

    private Byte attrType;

    private Long enable;

    private Long catelogId;

    private Byte showDesc;

    private static final long serialVersionUID = 1L;

}