package com.emts.service.question;

import com.emts.entity.question.TqChoiceOptionEntity;
import com.emts.service.question.ITqChoiceOptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * 选择题选项表
 * @author MengXH
 * @since 2023-06-16
 */
@RestController
@RequestMapping("/tqChoiceOptionEntity" )
public class TqChoiceOptionController {

    private final String prefix = "/tqChoiceOptionEntity";

    @Autowired
    private ITqChoiceOptionService tqChoiceOptionEntityService;

}