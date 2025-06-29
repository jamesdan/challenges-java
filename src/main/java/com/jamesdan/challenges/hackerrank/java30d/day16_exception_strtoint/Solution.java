package com.jamesdan.challenges.hackerrank.java30d.day16_exception_strtoint;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String S = bufferedReader.readLine();

        try {
            System.out.println(Integer.valueOf(S));
        } catch (NumberFormatException e) {
            System.out.println("Bad String");
        }

        bufferedReader.close();
    }
}
