package com.example.demo.ch02;

public class JavaVMStackSOF_1 {
    private int stackLength = 1;

    public void stackLeak() {
        stackLength++;
        stackLeak();
    }   

    public static void main(String[] args) {
        JavaVMStackSOF_1 oom = new JavaVMStackSOF_1();
        try {
            oom.stackLeak();
        } catch (Throwable e) {
            System.out.println("Stack 길이 :" + oom.stackLength);
            throw e;
        }
    }
}
