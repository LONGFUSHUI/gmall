package com.atguigu.gmall.oms.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 退货原因
 * @author liuzhanhong
 * @since 2020-06-22 17:16:49
 */
@ApiModel
@Data
@TableName("oms_order_return_reason")
public class OrderReturnReason implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	@ApiModelProperty(name = "id",value = "id")
	private Long id;
	/**
	 * 退货原因名
	 */
	@ApiModelProperty(name = "name",value = "退货原因名")
	private String name;
	/**
	 * 排序
	 */
	@ApiModelProperty(name = "sort",value = "排序")
	private Integer sort;
	/**
	 * 启用状态
	 */
	@ApiModelProperty(name = "status",value = "启用状态")
	private Integer status;
	/**
	 * create_time
	 */
	@ApiModelProperty(name = "createTime",value = "create_time")
	private Date createTime;

}