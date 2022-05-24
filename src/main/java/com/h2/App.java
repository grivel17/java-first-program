package com.h2;

/**
 * Hello world!
 *
 */

//todo module 4.9
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }

    public static int doubleTheNumber(int number) {
        return number *2;
    }

    private static int add(int[] numbers) {
        int sum;
        sum = 0;
        for(int i : numbers) {
            sum += i;
        }
        return sum; }

}
