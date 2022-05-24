package com.laychv.design.structural.CompositePattern;

public class Client {
    public static void main(String[] args) {
        Dir c = new Folder("C");
        c.addDir(new File("text.txt"));

        Dir win = new Folder("Windows");
        win.addDir(new File("ie.exe"));

        c.addDir(win);

        Dir logs = new Folder("logs");
        logs.addDir(new File("null.txt"));

        c.addDir(logs);

        Dir pro = new Folder("Program File");
        pro.addDir(new File("ftp.txt"));

        c.addDir(pro);

        c.print();
    }
}
