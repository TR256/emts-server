package com.emts.service.question;

import com.emts.entity.question.TqJudgeEntity;
import com.emts.service.question.ITqJudgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * 判断
 * @author MengXH
 * @since 2023-06-16
 */
@RestController
@RequestMapping("/tqJudgeEntity" )
public class TqJudgeController {

    private final String prefix = "/tqJudgeEntity";

    @Autowired
    private ITqJudgeService tqJudgeEntityService;

}