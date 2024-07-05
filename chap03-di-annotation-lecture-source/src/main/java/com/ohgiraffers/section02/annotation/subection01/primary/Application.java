package com.ohgiraffers.section02.annotation.subection01.primary;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.ohgiraffers.section02");

        String[] beanNames = context.getBeanDefinitionNames();
        for (String name : beanNames){
            System.out.println(name);
        }

        // 스프링 컨텍스트에 등록된 같은 타입의 Bean 이 3개나 있다는 뜻
        // 한개를 지정해준다.
        // expected single matching bean but found 3 : yaDon YadoKing Yadoran

        PokemonService pokemonService = context.getBean("pokemonServicePrimary", PokemonService.class);

        pokemonService.pokemonAttack();
    }
}
