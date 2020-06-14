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
public class ProductAttrValueEntity implements Serializable {
    private Long id;

    private Long spuId;

    private Long attrId;

    private String attrName;

    private String attrValue;

    private Integer attrSort;

    private Byte quickShow;

    private static final long serialVersionUID = 1L;

}