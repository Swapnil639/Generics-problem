package com.bridgelabz;

public class MaximumNumber {
    public void integerMax(int x, int y, int z) {
        if (x > y && x > z) {
                System.out.println("Maximum Integers is = " + x);
            }
        if (y > x && y > z) {
                System.out.println("Maximum Integers is = " + y);
            }
        if (z > x && z > y) {
                System.out.println("Maximum Integers is = " + z);
            }
    }
    public static void main(String[] args) {
        MaximumNumber obj=new MaximumNumber();
        obj.integerMax(10,20,30);
    }

}
