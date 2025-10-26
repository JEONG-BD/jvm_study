package com.example.demo.ch03;

import java.lang.ref.PhantomReference;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;

public class PhantomReferenceExample {
    public static void main(String[] args) {
        // ReferenceQueue 생성 (PhantomReference가 수거될 때 알림용)
        ReferenceQueue<MyObject> refQueue = new ReferenceQueue<>();

        // 객체 생성
        MyObject obj = new MyObject();

        // PhantomReference 생성
        PhantomReference<MyObject> phantomRef = new PhantomReference<>(obj, refQueue);

        System.out.println("PhantomReference.get(): " + phantomRef.get()); // 항상 null

        // 강한 참조 해제
        obj = null;

        // GC 실행
        System.gc();

        try {
            // ReferenceQueue에서 PhantomReference가 수거될 때까지 기다림
            Reference<? extends MyObject> refFromQueue = refQueue.remove();
            System.out.println("객체가 PhantomReference로 큐에 들어옴: " + refFromQueue);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    static class MyObject {
        @Override
        protected void finalize() throws Throwable {
            System.out.println("finalize() 호출됨");
        }
    }
}
