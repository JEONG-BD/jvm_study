package com.example.demo.ch03;

import java.lang.ref.SoftReference;

public class SoftReferenceExample {

    /*
    * VM 매개변수: [ "-Xmx50M" ]
    *
    *
    * */
    public static void main(String[] args) {
        // 강한 참조 생성
        String strong = new String("Hello, Soft Reference!");

        // 소프트 참조 생성
        SoftReference<String> softRef = new SoftReference<>(strong);

        System.out.println("======== GC 전");
        System.out.println("Strong: " + strong);
        System.out.println("Soft: " + softRef.get());

        // 강한 참조 제거
        strong = null;

        // 메모리 부족을 유도하기 위한 큰 배열 생성
        try {
            byte[] memoryHog = new byte[100 * 1024 * 1024]; // 100MB
        } catch (OutOfMemoryError e) {
            System.out.println("메모리 부족 발생!");
        }

        // GC 요청
        System.gc();

        System.out.println("======== GC 후");
        System.out.println("Soft: " + softRef.get());
    }
}


