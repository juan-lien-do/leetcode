package org.example.ejercicios.medium;

import java.util.HashMap;

public class SimpleBankSystem {


    // demo
    public static void main(String[] args){
        Bank bank = new Bank(new long[]{10L, 100L, 20L, 50L, 30L});

        System.out.println(bank.withdraw(3,10L));
        System.out.println(bank.transfer(5,1,20L));
        System.out.println(bank.deposit(5,20L));
        System.out.println(bank.transfer(3,4,15L));
        System.out.println(bank.withdraw(10, 50L));
    }

}
