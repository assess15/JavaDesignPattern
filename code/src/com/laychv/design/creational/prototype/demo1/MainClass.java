package com.laychv.design.creational.prototype.demo1;

/**
 * 原型模式-测试
 */
public class MainClass {
    public static void main(String[] args) throws CloneNotSupportedException {
        Mail mail = new Mail();
        mail.setContent("初始化模版成功!");
        for (int i = 0; i < 10; i++) {
            Mail mail1 = (Mail) mail.clone();
            mail1.setName("姓名" + i);
            mail1.setAddress("地址" + i);
            mail1.setContent("恭喜你");
            MailUtils.sendMail(mail1);
        }
        MailUtils.saveMail(mail);
    }
}
