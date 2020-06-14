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
public class CategoryEntity implements Serializable {
    private Long catId;

    private String name;

    private Long parentCid;

    private Integer catLevel;

    private Byte showStatus;

    private Integer sort;

    private String icon;

    private String productUnit;

    private Integer productCount;

    private static final long serialVersionUID = 1L;

}