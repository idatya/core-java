package com.sh.java8.duration;

import java.time.Duration;

public class GFG { 
    public static void main(String[] args) 
    { 
  
        // Duration using parse() method 
        Duration duration 
            = Duration.parse("P2DT3H4M"); 
  
        System.out.println("Duration: "
                           + duration); 
  
        // Get the number of days 
        // using toDaysPart() method 
        //System.out.println(duration.toDaysPart()); 
    } 
} 
