package com.ohgiraffers.section01.scope.subsecticon02.prototype;

import com.ohgiraffers.common.Beverage;
import com.ohgiraffers.common.Bread;
import com.ohgiraffers.common.Product;
import com.ohgiraffers.common.ShoppingCart;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import java.time.LocalDate;

@Configuration
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
    @Scope("prototype")
    public ShoppingCart cart(){
        return new ShoppingCart();
    }
    /*
    XML 에서 <bean> 태그를 이용할 경우
    <bean id = "cart" class"com.ohgiraffers.common.ShoppingCart" scope="prototype"/>
    * * */
}