package com.company;

public class VendingMachine {
    static private final double RED_COST = 0.05;
    static private final double YELLOW_COST = 0.1;

    private double money;

    public VendingMachine() {
        this(0.0);
    }

    public VendingMachine(double money) {
        this.money = money;
    }

    public void addMoney(double money) {
        this.money += money;
    }

    public double getMoney() {
        return money;
    }

    public void dispenseRed() {
        if (haveEnoughCash(RED_COST)) {
            money -= RED_COST;
        } else {
            System.err.println("You do not have enough cash!\nPlease add some money first!");
        }
    }

    public void dispenseYellow() {
        if (haveEnoughCash(YELLOW_COST)) {
            money -= YELLOW_COST;
        } else {
            System.err.println("You do not have enough cash!\n Please add some money first!");
        }
    }

    public double dispenseMoney() {
        double temp = money;
        money = 0;
        return temp;
    }

    private boolean haveEnoughCash(double cost) {
        return money >= cost;
    }
}
