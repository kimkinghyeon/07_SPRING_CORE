package com.ohgiraffers.section02.subsection02.annotation;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class Owner {

    @PostConstruct
    // Owner 객체가 beFactory 에서 등록될 때 동작
    public void openShop(){
        System.out.println("사장 가게 문을 열어!!! 장사를 시작합니다!!!!!");
    }

    @PreDestroy
    // Owner 객체가 beFactory 에서 삭제될 때 동작
    public void closeShop(){
        System.out.println("문닫습니다.!!! 저리 꺼져 문어들아!!!!!");
    }
}
