package com.ohgiraffers.practice02.javaconfig;

import com.ohgiraffers.common.BoardDTO;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ContextConfiguration {
    @Bean("board")
    public BoardDTO getBoard(){
        System.out.println();
        return  new BoardDTO(1,"스프링 어렵노","그래도 내는 포기 못한다","나는 킹 이니까");
    }
}
