package com.laychv.design.structural.ProxyPattern.dynamicproxy;

public class OrderDao implements IOrderDao {
    @Override
    public void save() {
        System.out.println("保存订单数据！！！");
    }
}
