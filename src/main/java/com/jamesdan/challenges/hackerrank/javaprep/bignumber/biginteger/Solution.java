package com.jamesdan.challenges.hackerrank.javaprep.bignumber.biginteger;

import java.io.*;
import java.util.*;
import java.math.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        BigInteger A = scanner.nextBigInteger();
        BigInteger B = scanner.nextBigInteger();
        scanner.close();

        System.out.println(A.add(B));
        System.out.println(A.multiply(B));
    }
}