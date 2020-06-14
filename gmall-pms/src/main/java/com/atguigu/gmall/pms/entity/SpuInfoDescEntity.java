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
public class SpuInfoDescEntity implements Serializable {
    private Long spuId;

    private String decript;

    private static final long serialVersionUID = 1L;

}