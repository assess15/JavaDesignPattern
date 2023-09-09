package com.start.designpattern.structural.DecoratorPattern.android;

public class Service extends ContextWrapper {

    public Service(Context base) {
        super(base);
    }

    @Override
    public void startActivity(String intent) {
        super.startActivity(intent);
    }

    @Override
    public void startActivity(String intent, String bundle) {
        super.startActivity(intent, bundle);
    }
}
