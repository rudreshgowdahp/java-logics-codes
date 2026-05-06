package com.thinksworks.palindrome.external;

public class NumberTriangluar {
    public static void main(String[] args) {
        int rows = 4;

        for (int i =
             ; i <= rows; i++) {
            for (int j = 1; j <= rows - i; j++) {
                System.out.print("   ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print(i+"  ");
            }

            System.out.println();
        }
    }
}
