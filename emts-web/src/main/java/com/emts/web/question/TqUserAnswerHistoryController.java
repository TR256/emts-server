package com.emts.service.question;

import com.emts.entity.question.TqUserAnswerHistoryEntity;
import com.emts.service.question.ITqUserAnswerHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * 用户答案表
 * @author MengXH
 * @since 2023-06-16
 */
@RestController
@RequestMapping("/tqUserAnswerHistoryEntity" )
public class TqUserAnswerHistoryController {

    private final String prefix = "/tqUserAnswerHistoryEntity";

    @Autowired
    private ITqUserAnswerHistoryService tqUserAnswerHistoryEntityService;

}