package com.orangesir;

import io.reactivex.Flowable;

public class App
{
    public static void main( String[] args )
    {
//        Flowable.just("Hello world")
//                .subscribe(new Consumer<String>() {
//                    @Override
//                    public void accept(String s) {
//                        System.out.println(s);
//                    }
//                });

        Flowable.just("Hello world").subscribe(System.out::println);
    }
}
