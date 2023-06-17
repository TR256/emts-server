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
 * @Description 题目解析
 */
@Data
@ToString
@TableName("tq_explanation")
@ApiModel(value = "TqExplanationEntity", description = "TqExplanationEntity对象 题目解析")
public class TqExplanationEntity extends BaseEntity {

    @TableId(value = "explanation_id", type = IdType.AUTO)
    private Long explanationId;

    @TableField("explanation_content")
    private String explanationContent;

}