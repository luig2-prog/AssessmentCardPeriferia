package com.credibanco.assessment.card.controller;

import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;

@RestController
@RequestMapping("/api/v1/card")
public class CardController {

    private static final Logger loggerFactory = (Logger) LoggerFactory.getLogger(CardController.class);

}
