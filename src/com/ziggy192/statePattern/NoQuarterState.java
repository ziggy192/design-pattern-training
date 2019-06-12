package com.ziggy192.statePattern;

public class NoQuarterState extends State {


    public NoQuarterState(GumballMachine gumballMachine) {
        super(gumballMachine);
    }

    @Override
    public void insertQuarter() {
        System.out.println("Inserted quarter");
        gumballMachine.setState(gumballMachine.getHasQuarterState());
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

        System.out.println("Refilled");

    }


}
