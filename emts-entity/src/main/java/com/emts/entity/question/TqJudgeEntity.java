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
 * @Description 判断
 */
@Data
@ToString
@TableName("tq_judge")
@ApiModel(value = "TqJudgeEntity", description = "TqJudgeEntity对象 判断")
public class TqJudgeEntity extends BaseEntity {

    @TableId(value = "judge_id", type = IdType.AUTO)
    private Long judgeId;

    @TableField("question_id")
    private Long questionId;

    @TableField("question_content")
    private String questionContent;

    @TableField("answer_content")
    private Boolean answerContent;

}