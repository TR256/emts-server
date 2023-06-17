package com.emts.service.question;

import com.emts.entity.question.TqProblemEntity;
import com.emts.service.question.ITqProblemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * 简答题
 * @author MengXH
 * @since 2023-06-16
 */
@RestController
@RequestMapping("/tqProblemEntity" )
public class TqProblemController {

    private final String prefix = "/tqProblemEntity";

    @Autowired
    private ITqProblemService tqProblemEntityService;

}