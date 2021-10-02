package com.study.bootstudy;

import com.study.bootstudy.sort.BubbleSort;
import com.study.bootstudy.sort.JavaSort;
import com.study.bootstudy.sort.Sort;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Sort<Integer> bs = new JavaSort<>();

        System.out.println("result = "+bs.sort(Arrays.asList(5,2,4,1,3)));

    }
}
