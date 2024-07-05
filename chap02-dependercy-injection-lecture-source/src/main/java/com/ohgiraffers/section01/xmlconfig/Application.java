package com.ohgiraffers.section01.xmlconfig;

import com.ohgiraffers.common.MemberDTO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Application {
    public static void main(String[] args) {

        // xml 설정 파일을 기반으로 ApplicationContext
        ApplicationContext context = new GenericXmlApplicationContext("section01/xmlconfig/spring-context.xml");

        MemberDTO member = context.getBean(MemberDTO.class);

        System.out.println(member);
        // Member DTO 의 PersonalAccount 객체 출력
        System.out.println(member.getPersonalAccount());
        // 입금
        System.out.println(member.getPersonalAccount().deposit(10000));
        // 잔액출력
        System.out.println(member.getPersonalAccount().getBalance());
        // 출금
        System.out.println(member.getPersonalAccount().withDraw(5000));
        // 다시 잔액출력
        System.out.println(member.getPersonalAccount().getBalance());

    }
}
