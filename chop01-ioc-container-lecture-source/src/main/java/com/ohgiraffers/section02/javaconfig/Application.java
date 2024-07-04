package com.ohgiraffers.section02.javaconfig;

import com.ohgiraffers.common.MemberDTO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ContextConfiguration.class);

        MemberDTO member = context.getBean("getMember", MemberDTO.class);
        // @Bean("이름") 을 이용해서 id 를 메소드명과 다르게 지정해 줄 수 있다.
        MemberDTO member2 = context.getBean("member", MemberDTO.class);

        System.out.println(member);
    }
}
