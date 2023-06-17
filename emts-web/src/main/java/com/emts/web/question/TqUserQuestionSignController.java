package com.emts.service.question;

import com.emts.entity.question.TqUserQuestionSignEntity;
import com.emts.service.question.ITqUserQuestionSignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * 用户收藏标记
 * @author MengXH
 * @since 2023-06-16
 */
@RestController
@RequestMapping("/tqUserQuestionSignEntity" )
public class TqUserQuestionSignController {

    private final String prefix = "/tqUserQuestionSignEntity";

    @Autowired
    private ITqUserQuestionSignService tqUserQuestionSignEntityService;

}