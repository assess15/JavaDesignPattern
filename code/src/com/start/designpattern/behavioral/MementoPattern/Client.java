package com.start.designpattern.behavioral.MementoPattern;

public class Client {
    public static void main(String[] args) {
        // 构建游戏对象
        CallOfDuty game = new CallOfDuty();
        // 1.玩游戏
        game.play();
        // 存档管理器
        Caretaker caretaker = new Caretaker();
        // 2.存档
        caretaker.archive(game.createMemento());
        // 3.退出
        game.quit();
        // 构建新的游戏
        CallOfDuty newGame = new CallOfDuty();
        // 4.恢复之前的游戏
        newGame.restore(caretaker.getMemento());
    }
}
