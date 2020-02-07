package com.sh.java6.inheritence;

public class childA implements Parent {
    int i =1;
    childA() {

    }

    @Override
    public void display(String show) {
        System.out.println(show);
    }
}
