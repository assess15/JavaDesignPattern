package com.start.designpattern.behavioral.StatePattern.demo;

/**
 * 开机状态,此时再触发开机功能不做任何操作
 */
public class PowerOnState implements TvState {
    @Override
    public void nextChannel() {
        System.out.println("下—频道");
    }

    @Override
    public void prevChannel() {
        System.out.println("上—频道");
    }

    @Override
    public void turnUp() {
        System.out.println("调高音量");
    }

    @Override
    public void turnDown() {
        System.out.println("调低音量");
    }
}
