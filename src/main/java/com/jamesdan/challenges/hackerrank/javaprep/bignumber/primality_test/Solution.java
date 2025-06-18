package com.jamesdan.challenges.hackerrank.javaprep.bignumber.primality_test;

import java.io.*;
import java.math.*;

import static java.util.stream.Collectors.joining;


public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String n = bufferedReader.readLine();

        String result = "not prime";
        if(new BigInteger(n).isProbablePrime(1)) {
            result = "prime";
        }

        System.out.println(result);

        bufferedReader.close();
    }
}
