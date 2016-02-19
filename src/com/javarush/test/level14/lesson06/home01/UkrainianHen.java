package com.javarush.test.level14.lesson06.home01;

/**
 * Created by yevge on 2/13/2016.
 */
public  class UkrainianHen extends Hen{
    @Override
    public int getCountOfEggsPerMonth()
    {
        return 23;
    }

    @Override
    public String getDescription()
    {
        return super.getDescription() + " Моя страна - " + Country.UKRAINE + ". Я несу " + getCountOfEggsPerMonth() +" яиц в месяц.";
    }
}
