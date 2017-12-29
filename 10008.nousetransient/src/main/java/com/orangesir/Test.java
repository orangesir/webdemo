package com.orangesir;

class Data {
    private int a;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int inrc() {
        a++;
        return a;
    }
}

public class Test {

    public static void main(String[] args) {
        Data data = new Data();
        System.out.println(data.inrc());
    }
}
