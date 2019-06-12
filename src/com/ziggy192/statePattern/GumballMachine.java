package com.ziggy192.statePattern;

import java.util.Random;

public class GumballMachine {

    private State state;

    private HasQuarterState hasQuarterState;
    private NoQuarterState noQuarterState;
    private OutOfGumballState outOfGumbalState;
    private SoldState soldState;
    private WinnerState winnerState;

    private int count = 0;
    private int randWinder =0;

    public GumballMachine() {
        hasQuarterState = new HasQuarterState(this);
        noQuarterState = new NoQuarterState(this);
        outOfGumbalState = new OutOfGumballState(this);
        soldState = new SoldState(this);
        winnerState = new WinnerState(this);
    }

    public GumballMachine(int count) {
        this();

        this.state = noQuarterState;
        this.count = count;

    }

    public void insertQuarter() {
        state.insertQuarter();
    }

    public void ejectQuarter() {
        state.ejectQuarter();

    }

    public void turnCrank() {
        state.turnCrank();
        dispense();
    }

    public void dispense() {
        state.dispense();
    }


    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public HasQuarterState getHasQuarterState() {
        return hasQuarterState;
    }

    public void setHasQuarterState(HasQuarterState hasQuarterState) {
        this.hasQuarterState = hasQuarterState;
    }

    public NoQuarterState getNoQuarterState() {
        return noQuarterState;
    }

    public void setNoQuarterState(NoQuarterState noQuarterState) {
        this.noQuarterState = noQuarterState;
    }

    public OutOfGumballState getOutOfGumbalState() {
        return outOfGumbalState;
    }

    public void setOutOfGumbalState(OutOfGumballState outOfGumbalState) {
        this.outOfGumbalState = outOfGumbalState;
    }

    public WinnerState getWinnerState() {
        return winnerState;
    }

    public void setWinnerState(WinnerState winnerState) {
        this.winnerState = winnerState;
    }

    public SoldState getSoldState() {
        return soldState;
    }

    public void setSoldState(SoldState soldState) {
        this.soldState = soldState;
    }

    public void refill(int value ) {
        this.count += value;
        System.out.println("Refilled");
        state.refill(value);

    }

    public boolean isLuckyNumber() {
        return new Random().nextInt(10) == 0;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }


    @Override
    public String toString() {
        return "GumballMachine{" +
                "state=" + state +
                ", count=" + count +
                '}';
    }
}
