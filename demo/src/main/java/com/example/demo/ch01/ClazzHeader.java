package com.example.demo.ch01;

import org.openjdk.jol.info.ClassLayout;

public class ClazzHeader {
    public static void main(String[] args) {
        Object obj = new Object();
        int[] a= new int[4];
        System.out.println(ClassLayout.parseInstance(obj).toPrintable());
        System.out.println(ClassLayout.parseInstance(a).toPrintable());
        ClazzHeaderInner clazzHeaderInner = new ClazzHeaderInner("a", "b", "c");
        synchronized (clazzHeaderInner){
            System.out.println(ClassLayout.parseInstance(clazzHeaderInner).toPrintable());
        }

    }

    public static class ClazzHeaderInner{
        private String a;
        private String b;
        private String c;

        public ClazzHeaderInner(String a, String b, String c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }
    }
}
