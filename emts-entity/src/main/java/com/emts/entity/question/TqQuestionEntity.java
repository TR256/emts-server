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
 * @Description 
 */
@Data
@ToString
@TableName("tq_question")
@ApiModel(value = "TqQuestionEntity", description = "TqQuestionEntity对象 ")
public class TqQuestionEntity extends BaseEntity {

    @TableId(value = "question_id", type = IdType.AUTO)
    private Long questionId;

    @TableField("category_id")
    private Long categoryId;

    @TableField("course_id")
    private Long courseId;

    @TableField("question_type")
    private Integer questionType;

    @TableField("knowledge_point_id")
    private Long knowledgePointId;

    @TableField("explanation_id")
    private Long explanationId;

    @TableField("attachment_id")
    private Long attachmentId;

    @TableField("chapter_id")
    private Long chapterId;

}