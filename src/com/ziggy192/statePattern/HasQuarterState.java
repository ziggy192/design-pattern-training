package com.ziggy192.statePattern;

public class HasQuarterState extends State {


    public HasQuarterState(GumballMachine gumballMachine) {
        super(gumballMachine);
    }

    @Override
    public void insertQuarter() {
        printInvalid();
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Ejected quarter");
        gumballMachine.setState(gumballMachine.getNoQuarterState());

    }

    @Override
    public void turnCrank() {
        System.out.println("Turning crank");
        if (gumballMachine.isLuckyNumber()
        ) {
            System.out.println("***You Win a prize !");
            gumballMachine.setState(gumballMachine.getWinnerState());
        } else {

            gumballMachine.setState(gumballMachine.getSoldState());

        }

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
