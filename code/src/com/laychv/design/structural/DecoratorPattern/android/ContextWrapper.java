package com.laychv.design.structural.DecoratorPattern.android;

public class ContextWrapper extends Context {

    Context mBase;

    public ContextWrapper(Context base) {
        mBase = base;
    }

    @Override
    public void startActivity(String intent) {
        mBase.startActivity(intent);
    }

    @Override
    public void startActivity(String intent, String bundle) {
        mBase.startActivity(intent, bundle);
    }

    @Override
    public void startService() {

    }

    @Override
    public boolean stopService(String intent) {
        return false;
    }

    @Override
    public void bindService(String intent) {

    }

    @Override
    public void unbindService(String conn) {

    }
}
