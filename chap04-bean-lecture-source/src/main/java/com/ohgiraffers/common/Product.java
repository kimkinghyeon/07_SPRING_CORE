package com.ohgiraffers.common;

import lombok.*;

@AllArgsConstructor
@Setter
@Getter
@NoArgsConstructor
@ToString
public class Product {
    private String name; //상품명
    private int price;//상품가격
}
