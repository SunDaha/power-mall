package com.sundaha.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@ApiModel(description="notice")
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "notice")
public class Notice implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 公告id
     */
    @TableId(value = "id", type = IdType.INPUT)
    @ApiModelProperty(value="公告id")
    private Long id;

    /**
     * 店铺id
     */
    @TableField(value = "shop_id")
    @ApiModelProperty(value="店铺id")
    private Long shopId;

    /**
     * 公告标题
     */
    @TableField(value = "title")
    @ApiModelProperty(value="公告标题")
    private String title;

    /**
     * 公告内容
     */
    @TableField(value = "content")
    @ApiModelProperty(value="公告内容")
    private String content;

    /**
     * 状态(1:公布 0:撤回)
     */
    @TableField(value = "`status`")
    @ApiModelProperty(value="状态(1:公布 0:撤回)")
    private Boolean status;

    /**
     * 是否置顶
     */
    @TableField(value = "is_top")
    @ApiModelProperty(value="是否置顶")
    private Byte isTop;

    /**
     * 发布时间
     */
    @TableField(value = "create_time")
    @ApiModelProperty(value="发布时间")
    private Date createTime;

    /**
     * 更新时间
     */
    @TableField(value = "update_time")
    @ApiModelProperty(value="更新时间")
    private Date updateTime;
}