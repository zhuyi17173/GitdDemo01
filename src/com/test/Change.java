package com.test;

import java.util.Scanner;

/**
 * @Author: 朱屹
 * @Date 2020/5/8 8:35
 * @Description:
 */
class Change {
    Scanner sc = new Scanner(System.in);
    Admin admin = new Admin();

    public void InputDate() {
        System.out.println("请输入用户名:");
        String userName = sc.next();
        System.out.println("请输入登录密码:");
        String password = sc.next();
        boolean flag = admin.login(userName, password);
        if (flag) {
            change(userName,password);
        } else {
            System.out.println("登录失败！");
            InputDate();
        }
    }

    public void change(String userName, String password) {
            System.out.println("请输入新密码:");
            admin.password = sc.next();
            System.out.println("请确认密码:");
            admin.newPassword = sc.next();
            if (admin.password.equals(admin.newPassword)) {
                System.out.println("密码修改正确!新的密码为:" + admin.password);
            } else {
                System.out.println("两次输入密码不一致?");
                change(userName,password);
            }
    }
}
