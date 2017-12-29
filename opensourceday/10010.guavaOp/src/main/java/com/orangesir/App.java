package com.orangesir;

import com.google.common.math.IntMath;

public class App
{
    public static void main( String[] args )
    {
        int a = 2147483647;
        int b = 5;

        int c = IntMath.checkedAdd(a,b);
        System.out.println( "c:"+String.valueOf(c));
    }
}
