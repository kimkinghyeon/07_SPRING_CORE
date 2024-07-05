package com.ohgiraffers.section02.annotation.common;


import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/*
@Primary
@Autowired 로 동일한 타입의 여러 Bean 을 찾게되는 경우
자동으로 연결 될 우선 시 할 타입 설정
동일한 타입의 클래스 중 한개만 @Primary 어노테이션을 사용 할 수 있다.
* */
@Primary
@Component
public class yaDon implements Pokemon{
    @Override
    public void attack() {
        System.out.println("야돈 염동력🎇");
    }
}
