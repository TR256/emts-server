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
 * @Description 用户收藏标记
 */
@Data
@ToString
@TableName("tq_user_question_sign")
@ApiModel(value = "TqUserQuestionSignEntity", description = "TqUserQuestionSignEntity对象 用户收藏标记")
public class TqUserQuestionSignEntity extends BaseEntity {

    @TableField("user_id")
    private Long userId;

    @TableField("question_id")
    private Long questionId;

    @TableField("sign")
    private Integer sign;

    @TableField("user_question_sign_id")
    private Long userQuestionSignId;

}