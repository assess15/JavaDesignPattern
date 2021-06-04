package com.laychv.design.structural.proxy.dynamicproxy;

public class UserDao implements IUserDao {
    @Override
    public void save() {
        System.out.println("保存用户数据!!!!");
    }
}
