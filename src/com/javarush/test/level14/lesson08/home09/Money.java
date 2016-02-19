package com.javarush.test.level14.lesson08.home09;

public abstract class Money
{
    private double n ;
    public Money(double amount)
    {
        this.n = amount;
    }

    public double getAmount(){
        return n;
    }

    public abstract String getCurrencyName();
}

