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
public class CommentReplayEntity implements Serializable {
    private Long id;

    private Long commentId;

    private Long replyId;

    private static final long serialVersionUID = 1L;

}