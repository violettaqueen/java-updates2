package com.cydeo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FunctionalInterfacePractice {

    public static void main(String[] args) {
                          //array - reference name of int[] obj
        Function<int[], List<Integer>> arrayToList = array -> {

            List<Integer> list = new ArrayList<>();
            for (int each : array) {
                list.add(each);
            }
            return list;
        };


        int[] arr = {1, 20, 43, 12};
        List<Integer> list = arrayToList.apply(arr);


    }
}
