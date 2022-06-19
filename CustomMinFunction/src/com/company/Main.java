package com.company;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Function;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] input = Arrays.stream(scan.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        Function<int[], Integer> output = (int[] array) ->{
            int min = Integer.MAX_VALUE;
            for (int el :  array) {
                if (el < min){
                    min = el;
                }
            }
            return min;
        };
        System.out.println(output.apply(input));
    }
}
