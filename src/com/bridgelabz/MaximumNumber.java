package com.bridgelabz;


public class MaximumNumber {
    public static void floatMax(float x, float y, float z) {
        Float max=x;
        if (y.compareTo(max)>0){
                max=y;
        }
        if (z.compareTo(max)>0){
               max=z;
        }
        System.out.println(max+" is maximum");
    }

    public static void main(String[] args) {
        floatMax(10.4f,20.6f,30.9f);
    }
      


    }
}
