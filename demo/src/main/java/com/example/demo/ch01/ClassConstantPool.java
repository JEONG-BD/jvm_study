package com.example.demo.ch01;

public class ClassConstantPool {
    public static void main(String[] args) {
        String s = "Hello world";
        int n = 1;
        System.out.println(s + n);

        Apple apple = new Apple();
        apple.setName("test");
    }


    static class Apple{
        private String name;
        private int weight;

        public void setName(String name) {
            this.name = name;
        }

        public void setWeight(int weight) {
            this.weight = weight;
        }
    }
}
