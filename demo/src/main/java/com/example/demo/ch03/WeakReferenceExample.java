package com.example.demo.ch03;

import java.lang.ref.WeakReference;

public class WeakReferenceExample {
    public static void main(String[] args) {
        // 강한 참조 생성
        String strong = new String("Hello, Weak Reference!");

        // 약한 참조 생성
        WeakReference<String> weakRef = new WeakReference<>(strong);

        System.out.println("====== GC 전");
        System.out.println("Strong: " + strong);
        System.out.println("Weak: " + weakRef.get());

        // 강한 참조 해제
        strong = null;

        // GC 요청
        System.gc();

        // 약간의 시간 대기 (GC가 동작할 시간을 줌)
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("====== GC 후");
        System.out.println("Strong: " + strong);
        System.out.println("Weak: " + weakRef.get()); // GC에 의해 null이 될 가능성 높음
    }
}

