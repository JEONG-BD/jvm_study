package com.example.demo.ch01;

import org.openjdk.jol.info.ClassLayout;


public class AppleMemoryLayoutMain {

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40};

        System.out.println(ClassLayout.parseClass(Apple.class)
                .toPrintable());

        System.out.println(ClassLayout.parseInstance(arr)
                .toPrintable());

    }
}
