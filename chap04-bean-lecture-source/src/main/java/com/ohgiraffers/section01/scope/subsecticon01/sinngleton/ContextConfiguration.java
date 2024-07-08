package com.ohgiraffers.section01.scope.subsecticon01.sinngleton;

import com.ohgiraffers.common.Beverage;
import com.ohgiraffers.common.Bread;
import com.ohgiraffers.common.Product;
import com.ohgiraffers.common.ShoppingCart;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

import java.time.LocalDate;

public class ContextConfiguration {

    @Bean
    public Product carpBread(){
        return new Bread("붕어빵",1000, LocalDate.now());
    }

    @Bean
    public Product milk(){
        return new Beverage("딸기우유",1500,500);
    }

    @Bean
    public Product water(){
        return new Beverage("삼다수",3000,500);
    }
    @Bean
    @Scope("singleton")
    public ShoppingCart cart(){
        return new ShoppingCart();
    }
}
