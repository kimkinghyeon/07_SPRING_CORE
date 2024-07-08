package com.ohgiraffers.common;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;

@NoArgsConstructor
@Getter
@Setter
@ToString(callSuper = true)
public class Bread extends Product{
    private LocalDate bakedDate; // 생산시간

    // 부모클래스까지 초기화 하는 생성자
    public Bread(String name, int price, LocalDate bakedDate) {

        super(name, price); // 부모클래스 생성자
        this.bakedDate = bakedDate;
    }

}
