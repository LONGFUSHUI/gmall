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
public class SkuSaleAttrValueEntity implements Serializable {
    private Long id;

    private Long skuId;

    private Long attrId;

    private String attrName;

    private String attrValue;

    private Integer attrSort;

    private static final long serialVersionUID = 1L;

}