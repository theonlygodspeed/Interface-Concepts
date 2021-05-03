package com.company;

public class Person {
    int coins, count;

    public Person(int coins) {
        this.coins = coins;
        this.count = 3;
    }

    public void insertCoin( Coinable coinable, int coins) {
        System.out.println("\n Farm game");
        System.out.println("\nInsert coin: " + coins);


        if (coins > 2) {
            if(!coinable.insertCoin()) {

            }

            else {
                coins = coins - count;
                System.out.println("Coins left: " + coins);
                System.out.println("Play again?");
            }
        }

        else {
            System.out.println("Coins Returned");
        }
    }
}
