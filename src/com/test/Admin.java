package com.test;

/**
 * @Author: 苏金朋
 * @Date 2020/5/8 8:35
 * @Description:
 */
public class Admin {
    String name = "admin";
    String password = "123456";
    String newPassword;
    public boolean login(String name,String password){
        boolean flag = false;
        if (this.name.equals(name) && this.password.equals(password)){
                flag = true;
        }else {
                flag = false;
        }
        return flag;
    }
}
