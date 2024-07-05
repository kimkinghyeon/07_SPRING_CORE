package com.ohgiraffers.practice02.javaconfig;

import com.ohgiraffers.common.BoardDTO;
import com.ohgiraffers.common.MemberDTO;
import org.springframework.context.annotation.Bean;

public class ContextConfiguration {
    @Bean("member")
    public MemberDTO getMemberDTO(){
        return new MemberDTO(1L,"꿈나무");
    }
    @Bean("board")
    public BoardDTO boardGenerator(){
        BoardDTO boardDTO = new BoardDTO();
        boardDTO.setId(1L);
        boardDTO.setTitle("의존성");
        boardDTO.setContent("블라블라");
        boardDTO.setWriter(getMemberDTO());
        return boardDTO;
    }
}
