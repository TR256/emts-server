package com.emts.entity.basic;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.FieldStrategy;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.Version;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

@Data
public class BaseEntity implements Serializable {

    /**
     * 创建者
     */
    @ApiModelProperty("创建者")
    @TableField(value = "created_by", fill = FieldFill.INSERT, updateStrategy = FieldStrategy.IGNORED)
    private String createdBy;

    /**
     * 创建时间
     */
    @ApiModelProperty("创建时间")
    @TableField(value = "created_time", fill = FieldFill.INSERT, updateStrategy = FieldStrategy.IGNORED)
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
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date updatedTime;

    /**
     * 删除状态：1正常；0删除
     */
    @ApiModelProperty("启用")
    @TableField(value = "enabled")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Boolean enabled;

    @ApiModelProperty("版本")
    @Version
    @TableField(value = "version", insertStrategy = FieldStrategy.DEFAULT, fill = FieldFill.INSERT_UPDATE)
    private Integer version;

}
