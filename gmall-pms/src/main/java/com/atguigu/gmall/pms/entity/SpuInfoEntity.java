package com.atguigu.gmall.pms.entity;

import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ApiModel
public class SpuInfoEntity implements Serializable {
    private Long id;

    private String spuName;

    private String spuDescription;

    private Long catalogId;

    private Long brandId;

    private Byte publishStatus;

    private Date createTime;

    private Date updateTime;

    private static final long serialVersionUID = 1L;

}