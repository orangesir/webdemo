package com.orangesir;

public class App
{
    public static void main( String[] args )
    {
        {
            int[] a = new int[128*1024*1024];
        }
//        int b = 0;
        System.gc();
    }
}
