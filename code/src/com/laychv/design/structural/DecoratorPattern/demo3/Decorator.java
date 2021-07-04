package com.laychv.design.structural.DecoratorPattern.demo3;

public abstract class Decorator extends Component {

    private Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    void operate() {
        component.operate();
    }
}
