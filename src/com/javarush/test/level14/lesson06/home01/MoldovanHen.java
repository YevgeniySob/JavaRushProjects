package com.javarush.test.level14.lesson06.home01;

/**
 * Created by yevge on 2/13/2016.
 */
public class MoldovanHen extends Hen{
    @Override
    public int getCountOfEggsPerMonth()
    {
        return 4;
    }

    @Override
    public String getDescription()
    {
        return super.getDescription() + " Моя страна - " + Country.MOLDOVA + ". " +
                "Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}
