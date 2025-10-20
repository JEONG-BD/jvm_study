package com.example.demo.ch02;

import java.util.ArrayList;
import java.util.List;


public class HeapOMM {
    static class OOMObject {

    }
    
    public static void main(String[] args) {
        List<OOMObject> list = new ArrayList<OOMObject>();
        while (true) {
            list.add(new OOMObject());  
        }
    }
}

