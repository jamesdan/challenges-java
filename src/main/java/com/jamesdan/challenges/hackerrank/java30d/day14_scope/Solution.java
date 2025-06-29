package com.jamesdan.challenges.hackerrank.java30d.day14_scope;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


class Difference {
    private int[] elements;
    public int maximumDifference;

    // Add your code here
    Difference(int[] arr) {
        this.elements = arr;
    }

    public void computeDifference() {
        int max = Arrays.stream(this.elements).max().getAsInt();
        int min = Arrays.stream(this.elements).min().getAsInt();
        this.maximumDifference = max-min;
    }
} // End of Difference class

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}
