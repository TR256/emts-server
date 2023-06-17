package com.emts.service.question;

import com.emts.entity.question.TqQuestionEntity;
import com.emts.service.question.ITqQuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * 
 * @author MengXH
 * @since 2023-06-16
 */
@RestController
@RequestMapping("/tqQuestionEntity" )
public class TqQuestionController {

    private final String prefix = "/tqQuestionEntity";

    @Autowired
    private ITqQuestionService tqQuestionEntityService;

}