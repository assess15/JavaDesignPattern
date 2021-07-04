package com.laychv.design.structural.DecoratorPattern.android;

public class Activity extends ContextThemeWrapper {
    public Activity(Context base) {
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
