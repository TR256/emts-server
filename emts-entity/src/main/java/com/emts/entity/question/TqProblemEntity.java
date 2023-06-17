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
 * @Description 简答题
 */
@Data
@ToString
@TableName("tq_problem")
@ApiModel(value = "TqProblemEntity", description = "TqProblemEntity对象 简答题")
public class TqProblemEntity extends BaseEntity {

    @TableId(value = "problem_id", type = IdType.AUTO)
    private Long problemId;

    @TableField("question_id")
    private Long questionId;

    @TableField("question_content")
    private String questionContent;

    @TableField("answer_content")
    private String answerContent;

}