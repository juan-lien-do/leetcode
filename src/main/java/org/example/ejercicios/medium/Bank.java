package org.example.ejercicios.medium;

import java.util.HashMap;

public class Bank {
    private HashMap<Integer, Long> accounts;

    public Bank(long[] balance) {
        this.accounts = new HashMap<>();
        for(int i = 0; i < balance.length; i++){
            accounts.put(i+1, balance[i]);
        }
    }

    public boolean transfer(int account1, int account2, long money) {
        if (money < 0L) return false;
        else if (!accounts.containsKey(account1)) {
            return false;
        } else if (!accounts.containsKey(account2)) {
            return false;
        } else if (accounts.get(account1) < money) {
            return false;
        } else {
            long valueOrigin = accounts.get(account1) - money;
            long valueDestiny = accounts.get(account2) + money;
            accounts.put(account1, valueOrigin);
            accounts.put(account2, valueDestiny);
        }
        return true;
    }

    public boolean deposit(int account, long money) {
        if (money < 0L) return false;
        if (accounts.containsKey(account)){
            long pastValue = accounts.get(account);
            accounts.put(account, pastValue + money);
            return true;
        } else return false;
    }

    public boolean withdraw(int account, long money) {
        if (money < 0L) return false;
        if (!accounts.containsKey(account)){
            return false;
        } else {
            long newValue = accounts.get(account) - money;
            accounts.put(account, newValue);
        }
        return true;
    }
}