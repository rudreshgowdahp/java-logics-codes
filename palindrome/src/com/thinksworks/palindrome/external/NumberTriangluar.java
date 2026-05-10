package com.thinksworks.palindrome.external;

public class NumberTriangluar {
    public static void main(String[] args) {
        int n = 4;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n + i - 1; j++) {
                if (j <= n - i) {
                    System.out.print(" ");
                } else {
                    System.out.print(i);
                }
            }
            System.out.println();
        }
    }
}
