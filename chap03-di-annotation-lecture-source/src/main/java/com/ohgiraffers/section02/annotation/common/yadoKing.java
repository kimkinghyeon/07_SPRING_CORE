package com.ohgiraffers.section02.annotation.common;

import org.springframework.stereotype.Component;

@Component
public class yadoKing implements Pokemon {

    @Override
    public void attack() {
        System.out.println("야도킹 사이코키네시스🌠");
    }
}
