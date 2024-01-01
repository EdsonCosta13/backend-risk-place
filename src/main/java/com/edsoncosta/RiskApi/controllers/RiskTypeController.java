package com.edsoncosta.RiskApi.controllers;

import com.edsoncosta.RiskApi.services.RiskTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/risk")
public class RiskTypeController {

    @Autowired
    private RiskTypeService riskTypeService;

}
