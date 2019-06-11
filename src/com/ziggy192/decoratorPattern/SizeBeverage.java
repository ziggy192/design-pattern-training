package com.ziggy192.decoratorPattern;

public abstract class SizeBeverage extends Beverage{

    protected  Size size;

    public SizeBeverage(Size size) {
        this.size = size;
    }

    @Override
    public Size getSize() {
        return size;
    }

    @Override
    public void setSize(Size size) {
        this.size = size;
    }
}
