package com.ziggy192.statePattern;

public class SoldState extends State {
    public SoldState(GumballMachine gumballMachine) {
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
        System.out.println("Dispensing ball");
        gumballMachine.setCount(gumballMachine.getCount() - 1);
        if (gumballMachine.getCount() > 0) {
            gumballMachine.setState(gumballMachine.getNoQuarterState());
        } else {
            gumballMachine.setState(gumballMachine.getOutOfGumbalState());
        }
    }

    @Override
    void refill(int value) {
        System.out.println("Refilled");


    }
}
