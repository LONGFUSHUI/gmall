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
public class SkuInfoEntity implements Serializable {
    private Long skuId;

    private Long spuId;

    private String skuCode;

    private String skuName;

    private String skuDesc;

    private Long catalogId;

    private Long brandId;

    private String skuDefaultImg;

    private String skuTitle;

    private String skuSubtitle;

    private Long price;

    private Long weight;

    private static final long serialVersionUID = 1L;

}