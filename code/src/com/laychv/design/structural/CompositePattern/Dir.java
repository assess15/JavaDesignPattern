package com.laychv.design.structural.CompositePattern;

import java.util.ArrayList;
import java.util.List;

/**
 * 表示文件/文件夹抽象类
 */
public abstract class Dir {
    protected List<Dir> dirs = new ArrayList<>();
    private final String name;

    public Dir(String name) {
        this.name = name;
    }

    public abstract void addDir(Dir dir);

    public abstract void clear();

    public abstract void rmDir(Dir dir);

    public abstract void print();

    public abstract List<Dir> getFiles();

    public String getName() {
        return name;
    }
}
