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
 * @Description 选择题选项表
 */
@Data
@ToString
@TableName("tq_choice_option")
@ApiModel(value = "TqChoiceOptionEntity", description = "TqChoiceOptionEntity对象 选择题选项表")
public class TqChoiceOptionEntity extends BaseEntity {

    @TableField("choice_id")
    private Long choiceId;

    @TableField("correct")
    private Boolean correct;

    @TableField("option_content")
    private String optionContent;

    @TableField("attachment_id")
    private Long attachmentId;

    @TableId(value = "choice_option_id", type = IdType.AUTO)
    private Long choiceOptionId;

}