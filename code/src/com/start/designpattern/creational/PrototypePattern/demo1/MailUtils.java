package com.start.designpattern.creational.PrototypePattern.demo1;

import java.text.MessageFormat;

public class MailUtils {
    public static void sendMail(Mail mail) {
        String content = "向{0}同学,邮件地址{0},邮件内容{0},邮件发送成功";
        System.out.println(MessageFormat.format(content, mail.getName(), mail.getAddress(), mail.getContent()));
    }

    public static void saveMail(Mail mail) {
        System.out.println("存储邮件记录:" + mail.getContent());
    }
}
