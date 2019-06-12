package com.ziggy192.statePattern;

public abstract class State {
    protected GumballMachine gumballMachine;

    public State(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    abstract void insertQuarter();

    abstract void ejectQuarter();

    abstract void turnCrank();

    abstract void dispense();

    abstract void refill(int value);

    void printInvalid(){
        System.out.println("Invalid! "+this.getClass().getSimpleName());

    }


    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }
}
