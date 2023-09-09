package com.start.designpattern.structural.DecoratorPattern.android;

public class Application extends ContextWrapper {
    public Application(Context base) {
        super(base);
    }

    @Override
    public void startActivity(String intent, String bundle) {
        super.startActivity(intent, bundle);
    }


}
