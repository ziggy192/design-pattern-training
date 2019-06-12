package com.ziggy192.statePattern;

public class WinnerState extends State {


    public WinnerState(GumballMachine gumballMachine) {
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

        int dispensingBall = Math.min(2, gumballMachine.getCount());

        System.out.println("Dispensing ball with total="+dispensingBall);
        gumballMachine.setCount(gumballMachine.getCount() - dispensingBall);
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
