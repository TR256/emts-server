package com.emts.service.question;

import com.emts.entity.question.TqExplanationEntity;
import com.emts.service.question.ITqExplanationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * 题目解析
 * @author MengXH
 * @since 2023-06-16
 */
@RestController
@RequestMapping("/tqExplanationEntity" )
public class TqExplanationController {

    private final String prefix = "/tqExplanationEntity";

    @Autowired
    private ITqExplanationService tqExplanationEntityService;

}