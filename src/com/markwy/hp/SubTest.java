package com.markwy.hp;

import com.markwy.Test;

public class SubTest {

    public void fun() {
        Test t = new Test();
        // 不在同一个包内，能访问类公开的成员
        System.out.println("Visit class test's var outside this package: " + t.public_mem);
        // 不在同一个包内，不能访问类保护的成员
        //System.out.println("Visit class test's var outside this package: " + t.protected_mem);
        // 不在同一个包内，不能访问类默认（友好的）的成员
        //System.out.println("Visit class test's var outside this package: " + t.default_friend_mem);
    }
}
