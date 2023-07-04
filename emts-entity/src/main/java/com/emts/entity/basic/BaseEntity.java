package com.emts.entity.basic;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.Version;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class BaseEntity implements Serializable {

    /**
     * 创建者
     */
    @ApiModelProperty("创建者")
    @TableField(value = "created_by", fill = FieldFill.INSERT)
    private String createdBy;

    /**
     * 创建时间
     */
    @ApiModelProperty("创建时间")
    @TableField(value = "created_time", fill = FieldFill.INSERT)
    private Date createdTime;

    /**
     * 更新者
     */
    @ApiModelProperty("更新者")
    @TableField(value = "updated_by", fill = FieldFill.INSERT_UPDATE)
    private String updatedBy;

    /**
     * 更新时间
     */
    @ApiModelProperty("更新时间")
    @TableField(value = "updated_time", fill = FieldFill.INSERT_UPDATE)
    private Date updatedTime;

    /**
     * 删除状态：1正常；0删除
     */
    @ApiModelProperty("启用")
    @TableField(value = "enabled")
    private Boolean enabled;

    @ApiModelProperty("版本")
    @Version
    @TableField(value = "version", fill = FieldFill.INSERT_UPDATE)
    private Integer version;

}
