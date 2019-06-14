package com.ziggy192.proxyPattern.protectionProxy;

public class PersonBeanImpl implements PersonBean{
    private double rating;
    private int ratingCount;
    private String name;
    private String interest;

    public PersonBeanImpl(String name, String interest) {
        this.rating = 0;
        this.ratingCount = 0;
        this.name = name;
        this.interest = interest;
    }

    public void rate(double value) {
        rating += value;
        ratingCount++;
    }

    public double getRating() {
        return rating / ratingCount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInterest() {
        return interest;
    }

    public void setInterest(String interest) {
        this.interest = interest;
    }

    @Override
    public String toString() {
        return "PersonBeanImpl{" +
                "rating=" + rating +
                ", ratingCount=" + ratingCount +
                ", name='" + name + '\'' +
                ", interest='" + interest + '\'' +
                '}';
    }
}
