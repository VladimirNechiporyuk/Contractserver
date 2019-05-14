package com.flamelab.service;

import org.springframework.stereotype.Service;

@Service
public class MathService implements MathActions {

    @Override
    public Integer multiply(Integer number, Integer multiplier) {
        return number * multiplier;
    }
}
