package com.ziggy192.statePattern;

public class OutOfGumballState extends State {
    public OutOfGumballState(GumballMachine gumballMachine) {
        super(gumballMachine);
    }

    @Override
    public void insertQuarter() {
        printInvalid();
    }

    @Override
    public void ejectQuarter() {
        printInvalid();
    }

    @Override
    public void turnCrank() {
        printInvalid();
    }

    @Override
    public void dispense() {
        printInvalid();
    }

    @Override
    void refill(int value) {

        gumballMachine.setState(gumballMachine.getNoQuarterState());
        System.out.println("Refilled");
    }

}
