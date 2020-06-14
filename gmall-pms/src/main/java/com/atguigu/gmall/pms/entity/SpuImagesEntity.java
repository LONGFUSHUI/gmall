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
public class SpuImagesEntity implements Serializable {
    private Long id;

    private Long spuId;

    private String imgName;

    private String imgUrl;

    private Integer imgSort;

    private Byte defaultImg;

    private static final long serialVersionUID = 1L;

}