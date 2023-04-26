package com.bridgelabz;

public class MaximumNumber {
    public static void testMaxNum(Integer x,Integer y,Integer z){
        Integer max=x;
        if (y.compareTo(max)>0){
                max=y;
        }
        if (z.compareTo(max)>0){
               max=z;
        }
        System.out.println(max+" is maximum");
    }

    public static void main(String[] args) {
        testMaxNum(1,20,3);
       
    }

}
