package com.ohgiraffers.common;

public interface Account {
    // 잔액조회
    String getBalance();
    // 입금조회
    String deposit(int money);
    // 출금조회
    String withDraw(int money);
}
