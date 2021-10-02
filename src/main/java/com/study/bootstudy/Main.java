package com.study.bootstudy;

import com.study.bootstudy.sort.BubbleSort;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        BubbleSort<Integer> bs = new BubbleSort<>();

        System.out.println("result = "+bs.sort(Arrays.asList(5,2,4,1,3)));

    }
}
