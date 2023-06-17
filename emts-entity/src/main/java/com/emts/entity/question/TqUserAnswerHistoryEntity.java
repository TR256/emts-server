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
 * @Description 用户答案表
 */
@Data
@ToString
@TableName("tq_user_answer_history")
@ApiModel(value = "TqUserAnswerHistoryEntity", description = "TqUserAnswerHistoryEntity对象 用户答案表")
public class TqUserAnswerHistoryEntity extends BaseEntity {

    @TableField("question_id")
    private Long questionId;

    @TableField("correct_flag")
    private Boolean correctFlag;

    @TableField("user_id")
    private Long userId;

    @TableField("answer_hisrtory_id")
    private Long answerHisrtoryId;

}