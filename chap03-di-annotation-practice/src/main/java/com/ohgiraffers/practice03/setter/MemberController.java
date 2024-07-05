package com.ohgiraffers.practice03.setter;

import com.ohgiraffers.common.MemberDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.Map;

@Controller("memberSetter")
public class MemberController {

    @Autowired
    private MemberService memberService;

    public Map<Long, MemberDTO> selectMember() {
        return memberService.selectMember();
    }
}