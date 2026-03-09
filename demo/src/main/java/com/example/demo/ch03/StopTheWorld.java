package com.example.demo.ch03;

public class StopTheWorld {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("프로그램 시작");

        for (int i = 0; i < 5; i++) {
            byte[] data = new byte[10 * 1024 * 1024]; // 10MB
            Thread.sleep(1000); // Safe Point 발생 유도
        }

        System.out.println("프로그램 종료");
    }

}
