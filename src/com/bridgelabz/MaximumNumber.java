package com.bridgelabz;

import java.util.Scanner;

public class MaximumNumber {
    public void StringMax(String x, String y, String z) {
        if (x.length()>y.length() && x.length()>z.length()) {
                System.out.println("Maximum String is = " + x);
            }
        if (y.length() > x.length() && y.length() > z.length()) {
                System.out.println("Maximum String is = " + y);
            }
        if (z.length() > x.length() && z.length() > y.length()) {
                System.out.println("Maximum String is = " + z);
            }
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        MaximumNumber obj=new MaximumNumber();
        String x=scanner.next();
        String y=scanner.next();
        String z=scanner.next();
        obj.StringMax(x,y,z);
    }

}
