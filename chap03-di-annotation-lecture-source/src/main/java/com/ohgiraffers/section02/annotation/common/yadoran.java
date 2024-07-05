package com.ohgiraffers.section02.annotation.common;

import org.springframework.stereotype.Component;

@Component
public class yadoran implements Pokemon{
    @Override
    public void attack() {
        System.out.println("야도란 파도타기🌊");
    }
}
