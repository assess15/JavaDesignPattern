package com.laychv.design.structural.ProxyPattern.staticproxy;

public class UserDao implements IUserDao {
    @Override
    public void save() {
        System.out.println("保存数据!!!!");
    }
}
