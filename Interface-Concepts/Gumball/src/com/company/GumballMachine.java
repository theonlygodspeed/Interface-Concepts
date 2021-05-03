package com.company;

public class GumballMachine implements Coinable,  Dispensable{
    int gums = 0;

    public GumballMachine() {
        this.gums = 5;
    }

    @Override
    public boolean insertCoin() {
        if(this.gums  > 0) {
            this.dispense();
            return true;
        }
        System.out.println("No gumballs remaining");
        return false;
    }

    @Override
    public void dispense() {
        this.gums--;
        System.out.println("\n1 Gumball costs 3" +
                "           \nGum dispensed = 1");
    }

    @Override
    public void reload(int count) {
        this.gums += count;
    }
}