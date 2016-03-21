package com.javarush.test;

/**
 * Created by yevge on 3/2/2016.
 */
public class Palindrom {
    public void main(String[] args) {
        String check = "";
        if (palindrome("level"))
            check = "yes";
        else
            check = "No";
        System.out.println(check);
    }


    public static boolean palindrome (String s){
        if (s.length() <= 1) return true;
        else if (s.charAt(0) == s.charAt(s.length()))
            return palindrome(s.substring(1, s.length()));
        else return false;
    }
}
