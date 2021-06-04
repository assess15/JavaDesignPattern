package com.laychv.design.creational.prototype;

import java.util.ArrayList;

/**
 * 原型模式
 * 核心Cloneable
 * <p>
 * 深拷贝
 * 对引用的字段也进行拷贝
 * <p>
 * -------构造方法------
 * ++++++++++开始++++++++++
 * 配上文字111111文字
 * 图片1号图片
 * 图片2号图片
 * 图片3号图片
 * ++++++++++结束++++++++++
 * ++++++++++开始++++++++++
 * 配上文字111111文字
 * 图片1号图片
 * 图片2号图片
 * 图片3号图片
 * ++++++++++结束++++++++++
 * ++++++++++开始++++++++++
 * clone后修改的文档文字
 * 图片1号图片
 * 图片2号图片
 * 图片3号图片
 * 1111图片
 * 2222图片
 * 3333图片
 * ++++++++++结束++++++++++
 * ++++++++++开始++++++++++
 * 配上文字111111文字
 * 图片1号图片
 * 图片2号图片
 * 图片3号图片
 * ++++++++++结束++++++++++
 * <p>
 * 浅拷贝
 * 修改其中一份文档，另一份也会受影响
 * <p>
 * -------构造方法------
 * ++++++++++开始++++++++++
 * 配上文字111111文字
 * 图片1号图片
 * 图片2号图片
 * 图片3号图片
 * ++++++++++结束++++++++++
 * ++++++++++开始++++++++++
 * 配上文字111111文字
 * 图片1号图片
 * 图片2号图片
 * 图片3号图片
 * ++++++++++结束++++++++++
 * ++++++++++开始++++++++++
 * clone后修改的文档文字
 * 图片1号图片
 * 图片2号图片
 * 图片3号图片
 * 1111图片
 * 2222图片
 * 3333图片
 * ++++++++++结束++++++++++
 * ++++++++++开始++++++++++
 * 配上文字111111文字
 * 图片1号图片
 * 图片2号图片
 * 图片3号图片
 * 1111图片
 * 2222图片
 * 3333图片
 * ++++++++++结束++++++++++
 *
 * 区别：
 * 浅拷贝不涉及内部字段
 * 深拷贝涉及内部字段
 */
public class WordDoc implements Cloneable {

    private String text;
    private ArrayList<String> img = new ArrayList<>();

    public WordDoc() {
        System.out.println("-------构造方法------");
    }

    public static void main(String[] args) {
        WordDoc doc = new WordDoc();
        doc.setImg("图片1号");
        doc.setImg("图片2号");
        doc.setImg("图片3号");
        doc.setText("配上文字111111");
        doc.showDoc();

        try {
            WordDoc clone = doc.clone();
            clone.showDoc();
            clone.setText("clone后修改的文档");
            clone.setImg("1111");
            clone.setImg("2222");
            clone.setImg("3333");
            clone.showDoc();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        // 判断是哪种拷贝
        doc.showDoc();
    }

    @Override
    protected WordDoc clone() throws CloneNotSupportedException {
        try {
            // 浅拷贝
            WordDoc doc = (WordDoc) super.clone();
            doc.text = this.text;
            doc.img = this.img;
            // 深拷贝
//            WordDoc doc = (WordDoc) super.clone();
//            doc.text = this.text;
//            doc.img = (ArrayList<String>) this.img.clone();
            return doc;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public ArrayList<String> getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img.add(img);
    }

    public void showDoc() {
        System.out.println("++++++++++开始++++++++++");
        System.out.println(text + "文字");
        for (String s : img) {
            System.out.println(s + "图片");
        }
        System.out.println("++++++++++结束++++++++++");
    }
}
