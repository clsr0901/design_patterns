package com.design.patterns.flyweight.test1;

/**
 * @author chenliangsen
 * @date 2020/1/3 9:52
 */
public class Client {
    public static void main(String[] args) {
        SecurityMgr mgr = SecurityMgr.getInstande();
        mgr.login("张珊");
        mgr.login("李四");
        boolean f1 = mgr.hasPermit("张珊", "薪资数据", "查看");
        boolean f2 = mgr.hasPermit("李四", "薪资数据", "查看");

        System.out.println("f1 = " + f1);
        System.out.println("f2 = " + f2);
        for (int i = 0; i < 3; i++) {
            mgr.login("张珊" + i);
            mgr.hasPermit("张珊" + i, "薪资数据", "查看");
        }
    }
}
