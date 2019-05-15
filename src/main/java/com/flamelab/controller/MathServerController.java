package com.flamelab.controller;

import com.flamelab.service.MathActions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/math")
public class MathServerController {

    private MathActions mathActions;

    @Autowired
    public MathServerController(MathActions mathActions) {
        this.mathActions = mathActions;
    }

    @GetMapping("/multiply")
    @ResponseBody
    public Integer multiplyNumber(Integer number, Integer multiplier) {
        return mathActions.multiply(number, multiplier);
    }
}
