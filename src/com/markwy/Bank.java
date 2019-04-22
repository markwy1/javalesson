package com.markwy;
/*
    抽象类和方法
 */
abstract class Bank {
    public String account;
    public String password;
    public Bank(String account, String password) {
        this.account = account;
        this.password = password;
    }
    abstract String getMenoy();
}
