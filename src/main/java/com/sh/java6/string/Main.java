package com.sh.java6.string;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        System.out.println("Test " + System.getProperty("Test") + " " + args[0]);
        System.out.println(String.valueOf(Boolean.FALSE));
        System.out.println(("temp.temp1490880917247").split("\\.")[0]);
        System.out.println("start");
        try {
            test();
            System.out.println("end");
        } catch (Exception e) {
            System.out.println("catched");
        } finally {
            System.out.println("finally");
        }
        
        testBoolean();
        
        //testMap();
        
        testString();
        outerloop:
        for(int i=1; i<10;i++){
            for(int k=1; k<10;k++){
                System.out.println("k "+k);
                if(i==k){
                    System.out.println("hi");
                    break outerloop;
                }
            }
            System.out.println("i "+i);
        }
    }

    private static void testString() {
        String str = "uplc is in UP";
        System.out.println(str);
        System.out.println(str.replaceAll("up", "MP"));
    }

    private static void testMap() {
        Map map = new HashMap();
        System.out.println(map.get("id").toString()); //will give null pointer exception if no key with name "id"
        
    }

    private static void testBoolean() {
        System.out.println(Boolean.parseBoolean("bg"));
    }

    private static void test() throws Exception {
        throw new Exception();

    }
    
    
    

}