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
public class SpuCommentEntity implements Serializable {
    private Long id;

    private Long skuId;

    private Long spuId;

    private String spuName;

    private String memberNickName;

    private Boolean star;

    private String memberIp;

    private Date createTime;

    private Boolean showStatus;

    private String spuAttributes;

    private Integer likesCount;

    private Integer replyCount;

    private String resources;

    private String memberIcon;

    private Byte commentType;

    private String content;

    private static final long serialVersionUID = 1L;

}