package com.company;

public class Person {
    private int coins;

    public Person(int coins) {
        this.coins = coins;
    }

    public void insertCoin(Coinable coinable) {
        System.out.println("\n Gumball Price = 3 ");
        System.out.println("Coin/s inserted = " + coins + "");


        if (coinable.insertCoin()) {
            coins = coins - 3;
            System.out.println("Coin change = " + coins + "");
        }

        else if (!coinable.insertCoin()) {
            coins = coins + 0;
            System.out.println("Coin refunded" + coins +"");
        }
    }
}