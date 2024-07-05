package com.ohgiraffers.section02.javaconfig;

import com.ohgiraffers.common.Account;
import com.ohgiraffers.common.MemberDTO;
import com.ohgiraffers.common.PersonalAccount;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ContextConfiguration {
    @Bean("account")
    public Account accountGenerator(){
        return new PersonalAccount(20,"110-332-582340");
    }
    @Bean("member")
    public MemberDTO memberGenerator(){
        /*
        MemberDTO 생성자를 통해 Account 를 생성하는
        메소드를 호출 리턴값을 전달하여 Bean 을 조립할 수 있다.
        * * */
        MemberDTO member = new MemberDTO();
        member.setSequence(1);
        member.setName("king");
        member.setPhone("010-4142-3290");
        member.setEmail("king@gmail.com");
        member.setPersonalAccount(accountGenerator());
        return member;

    }
}
