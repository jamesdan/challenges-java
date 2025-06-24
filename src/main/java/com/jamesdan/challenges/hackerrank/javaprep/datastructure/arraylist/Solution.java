package com.jamesdan.challenges.hackerrank.javaprep.datastructure.arraylist;

import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        ArrayList<ArrayList<Integer>> arrs2D = new ArrayList<>();

        for(int i=0; i<n; i++) {
            ArrayList<Integer> arr = convert(scanner.nextLine());
            arrs2D.add(arr);
        }

        int q = scanner.nextInt();
        scanner.nextLine();

        for(int i=0; i<q; i++) {
            String[] parts = scanner.nextLine().split(" ");
            int x = Integer.parseInt(parts[0])-1;
            int y = Integer.parseInt(parts[1]);
            try {
                System.out.println(arrs2D.get(x).get(y));
            } catch (IndexOutOfBoundsException iobex) {
                System.out.println("ERROR!");
            }
        }

        scanner.close();
    }

    private static ArrayList<Integer> convert(String inputString) {
        ArrayList<Integer> integerList = new ArrayList<>();
        String numberPattern = "\\d+";
        Pattern numPattern = Pattern.compile(numberPattern);
        Matcher numMatcher = numPattern.matcher(inputString);

        while (numMatcher.find()) {
            integerList.add(Integer.parseInt(numMatcher.group()));
        }
        return integerList;
    }
}

