package com.flamelab.controller;

import com.flamelab.service.MathActions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/math")
public class MathServerController {

    private MathActions mathActions;

    @Autowired
    public MathServerController(MathActions mathActions) {
        this.mathActions = mathActions;
    }

    @GetMapping(value = "/multiply", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public Map<String, Integer> multiplyNumber(Integer number, Integer multiplier) {
        Integer resultOfMultiplying = mathActions.multiply(number, multiplier);
        Map<String, Integer> result = new HashMap<>();
        result.put("result", resultOfMultiplying);
        return result;
    }
}
