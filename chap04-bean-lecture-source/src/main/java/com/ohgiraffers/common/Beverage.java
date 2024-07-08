package com.ohgiraffers.common;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
// callSuper : 부모클래스의 toString 도 포함해서 출력한다. (default = false)
@ToString(callSuper = true)
public class Beverage extends Product {
private int capacity;

    public Beverage(String name, int price, int capacity) {
        super(name, price);
        this.capacity = capacity;
    }


}
