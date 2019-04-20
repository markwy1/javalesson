package com.markwy;

public class Test {
    /* 把类当成一个人，来理解操作权限
       私有的，锁在自己的抽屉里，只有本人能看到，如私房钱。子女也看不到。
       保护的，放在自己家里的，家庭成员如子女可以看，即便在外地（其他包）的也可以，子类如血缘关系，构成家庭圈子。
           也可理解为上级和下级，家庭对应公司。
       友好的（默认），放在小区院里，小区邻居可看到。包相当于小区，小区外的人进不来。
       公开的，放在公共场合，大街上，任何人都可看到。
     */
    private String private_mem;
    protected String protected_mem;
    public  String public_mem;
    String default_friend_mem;  // 默认是类间是朋友关系
    public Test() {
        private_mem = ":是私有成员，私人可用的，类本身";
        protected_mem = ":是保护成员，家庭可用的，子类";
        public_mem = ":是公有成员，公共可用的";
        default_friend_mem = ":是默认成员，朋友可用的";
    }
    void fun() {
        System.out.println("同一个类中的访问： ");
        System.out.println("private_mem" + private_mem);
        System.out.println("protected_mem" + protected_mem);
        System.out.println("public_mem" + public_mem);
        System.out.println("default_friend_mem" + default_friend_mem);

    }
}
