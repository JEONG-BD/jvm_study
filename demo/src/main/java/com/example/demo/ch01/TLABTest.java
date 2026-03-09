package com.example.demo.ch01;

public class TLABTest {
    public static void main(String[] args) {
        System.out.println("TLAB Test");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
