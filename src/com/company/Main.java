package com.company;

public class Main
{

    public static void main(String[] args)
    {
        int withdrawal = 137;

        int numOfFives = withdrawal / 5;
        int numOfOnes = withdrawal % 5;
        System.out.println(numOfFives);
        System.out.println(numOfOnes);
    }
}
