package com.emts.entity.question;

import com.emts.entity.basic.BaseEntity;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.ToString;
import io.swagger.annotations.ApiModel;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableName;


/**
 * @Author MengXH
 * @Date 2023-06-16
 *
 * @Description 材料分析题
 */
@Data
@ToString
@TableName("tq_material")
@ApiModel(value = "TqMaterialEntity", description = "TqMaterialEntity对象 材料分析题")
public class TqMaterialEntity extends BaseEntity {

    @TableId(value = "material_id", type = IdType.AUTO)
    private Long materialId;

    @TableField("question_id")
    private Long questionId;

    @TableField("material_content")
    private String materialContent;

}