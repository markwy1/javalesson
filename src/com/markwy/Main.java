package com.markwy;

/*
    类、方法的4种访问权限
 */
public class Main {
    private void fun() {
        Test t = new Test();
        System.out.println("同一个包中的类访问： ");
        //System.out.println("private_mem" + t.private_mem);
        System.out.println("protected_mem" + t.protected_mem);
        System.out.println("public_mem" + t.public_mem);
        System.out.println("default_friend_mem" + t.default_friend_mem);

    }
    public static void main(String[] args) {
	// write your code here
        Test t = new Test();
        t.fun();
        Main m = new Main();
        m.fun();
    }
}
