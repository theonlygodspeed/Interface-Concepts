package com.company;

public class TestMachine {

    public static void main (String[] args) {

        ArcadeMachine arcadeMachine = new ArcadeMachine();
        Person person = new Person(3);

        person.insertCoin(arcadeMachine, 2);
        person.insertCoin(arcadeMachine, 22);
        person.insertCoin(arcadeMachine, 32);




    }
}