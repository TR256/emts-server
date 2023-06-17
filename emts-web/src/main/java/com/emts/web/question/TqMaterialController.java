package com.emts.service.question;

import com.emts.entity.question.TqMaterialEntity;
import com.emts.service.question.ITqMaterialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * 材料分析题
 * @author MengXH
 * @since 2023-06-16
 */
@RestController
@RequestMapping("/tqMaterialEntity" )
public class TqMaterialController {

    private final String prefix = "/tqMaterialEntity";

    @Autowired
    private ITqMaterialService tqMaterialEntityService;

}