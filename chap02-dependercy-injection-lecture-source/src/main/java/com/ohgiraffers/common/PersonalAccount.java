package com.ohgiraffers.common;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class PersonalAccount implements Account {

    private final int bankCode;   //은행코드
    private final String accNo; //계좌번호
    private int balance;          //잔액

    public PersonalAccount(int bankCode, String accNo) {
        this.bankCode = bankCode;
        this.accNo = accNo;
    }

    @Override
    public String getBalance() {
        return this.accNo + " 계좌에 남은 Money : " + this.balance;
    }

    @Override
    public String deposit(int money) {
        String str = "";
        if (money > 0) {
            this.balance += money;
            str = money + " 원이 입금되었습니다.";
        } else {
            str = "금액을 잘못 입력하셨습니다.";
        }
        return str;
    }

    @Override
    public String withDraw(int money) {
        String str = "";
        if (this.balance >= money) {
            this.balance -= money;
            str = money + " 원이 출금되었습니다.";
        } else {
            str = "잔액이 부족합니다. 잔액을 확인하세요..";
        }
        return str;
    }
}
