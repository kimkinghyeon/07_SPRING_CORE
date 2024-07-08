package com.ohgiraffers.section02.reflection;

public class Account {
    private String bankCode; //은행코드
    private String accNo;    //계좌번호
    private String accPwd;   //비밀번호
    private int balance;     //잔액

    public Account() {
    }

    public Account(String bankCode, String accNo, String accPwd) {
        this.bankCode = bankCode;
        this.accNo = accNo;
        this.accPwd = accPwd;
    }

    public Account(String bankCode, String accNo, String accPwd, int balance) {
        this(bankCode, accNo, accPwd);
        this.balance = balance;
    }

    // 현재 잔액을 출력해주는 메소드

    // 금액을 매개변수로 전달받아 입금 시켜주는 메소드

    // 금액을 매개변수로 전달받아 출금 시켜주는 메소드
}
