package com.start.designpattern.behavioral.MementoPattern;

public class CallOfDuty {
    private int mCheckpoint = 1;
    private int mLifeValue = 100;
    private String mWeapon = "biu～biu～biu～";

    //
    public void play() {
        System.out.println("玩游戏：" + String.format("第%d关", mCheckpoint) + "奋勇杀敌中");
        mLifeValue -= 10;
        System.out.println("进度升级啦～");
        mCheckpoint++;
        System.out.println("到达 " + String.format("第%s关", mCheckpoint));
    }

    //
    public void quit() {
        System.out.println("----------");
        System.out.println("退出前的游戏属性" + this.toString());
        System.out.println("退出游戏");
        System.out.println("----------");
    }

    // 创建备忘录
    public Memento createMemento() {
        Memento memento = new Memento();
        memento.mCheckpoint = mCheckpoint;
        memento.mLifeValue = mLifeValue;
        memento.mWeapon = mWeapon;
        return memento;
    }

    // 恢复
    public void restore(Memento memento) {
        this.mCheckpoint = memento.mCheckpoint;
        this.mLifeValue = memento.mLifeValue;
        this.mWeapon = memento.mWeapon;
        System.out.println("恢复后的游戏属性：" + this.toString());
    }

    @Override
    public String toString() {
        return "CallOfDuty{" +
                "mCheckpoint=" + mCheckpoint +
                ", mLifeValue=" + mLifeValue +
                ", mWeapon='" + mWeapon + '\'' +
                '}';
    }
}
