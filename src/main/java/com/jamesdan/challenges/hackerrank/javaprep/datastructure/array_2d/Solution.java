package com.jamesdan.challenges.hackerrank.javaprep.datastructure.array_2d;

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

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, 6).forEach(i -> {
            try {
                arr.add(
                        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                                .map(Integer::parseInt)
                                .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        solve(arr);
        bufferedReader.close();
    }

    private static void solve(List<List<Integer>> arr) {
        List<Integer> sums = new ArrayList<>();
        for(int y=0; y<4; y++) {
            for(int x=0; x<4; x++) {
                int index = x+(y*4);
                sums.add(index, sum3x3HourGlass(arr, x, y));
            }
        }
        System.out.println(sums.stream().max(Comparator.naturalOrder()).get());
    }

    private static int sum3x3HourGlass(List<List<Integer>> arr, int xIdx, int yIdx) {
        int result = arr.get(yIdx).get(xIdx)
                + arr.get(yIdx).get(xIdx+1)
                + arr.get(yIdx).get(xIdx+2)
                + arr.get(yIdx+1).get(xIdx+1)
                + arr.get(yIdx+2).get(xIdx)
                + arr.get(yIdx+2).get(xIdx+1)
                + arr.get(yIdx+2).get(xIdx+2)
                ;
        return result;
    }
}
