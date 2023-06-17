package com.emts.service.question;

import com.emts.entity.question.TqFillEntity;
import com.emts.service.question.ITqFillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * 填空
 * @author MengXH
 * @since 2023-06-16
 */
@RestController
@RequestMapping("/tqFillEntity" )
public class TqFillController {

    private final String prefix = "/tqFillEntity";

    @Autowired
    private ITqFillService tqFillEntityService;

}