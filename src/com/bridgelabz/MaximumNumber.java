package com.bridgelabz;

public class MaximumNumber {
    public void floatMax(float x, float y, float z) {
        if (x > y && x > z) {
                System.out.println("Maximum Float is = " + x);
            }
        if (y > x && y > z) {
                System.out.println("Maximum Float is = " + y);
            }
        if (z > x && z > y) {
                System.out.println("Maximum Float is = " + z);
            }
    }
    public static void main(String[] args) {
        MaximumNumber obj=new MaximumNumber();
        obj.floatMax(10.4f,20.6f,30.9f);
    }

}
