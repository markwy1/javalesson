package com.markwy;

/*
    实现了父类中的抽象方法
 */
public class AccountZhang extends Bank {
    public AccountZhang(String account, String password) {
        super(account, password);
    }
    String getMenoy() {
        System.out.println("Zhang 的帐户：" + account + "密码：" + password);
        return "Zhang取出2000元";
    }
}
