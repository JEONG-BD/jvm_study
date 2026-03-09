package com.example.demo.ch02;

public class LocalTableCheck {
    public static void main(String[] args) {
        LocalInnerClass localInnerClass = new LocalInnerClass();

    }

    public static class LocalInnerClass{
        public void print(String str){
            System.out.println(str);
        }

        public int add(int a, int b){
            return a + b;
        }
    }
}
