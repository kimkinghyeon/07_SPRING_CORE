package com.ohgiraffers.practice03.annotationconfig;

import com.ohgiraffers.common.BoardDTO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ContextConfiguration.class);
        BoardDAO board = context.getBean("board",BoardDAO.class);
        String[] beanNames = context.getBeanDefinitionNames();
        for (String beanName : beanNames){
            System.out.println("beanName = " + beanName);
        }
        System.out.println(board.selectBoard(1L));
        System.out.println(board.selectBoard(2L));
        System.out.println(board.insertBoard(new BoardDTO(3L,"하하하하","어지럽다","집에가자")));
        System.out.println(board.selectBoard(3L));
    }
}
