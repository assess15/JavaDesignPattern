package com.laychv.design.structural.DecoratorPattern.android;

public class ContextThemeWrapper extends ContextWrapper {

    public ContextThemeWrapper(Context base) {
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
