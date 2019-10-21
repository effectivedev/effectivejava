package io.github.effectivedev.effectivejava.chapter7;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * effectivejava
 * Item43 :  람다보다는 메서드 참조를 사용하라
 * Github : https://github.com/effectivedev
 * Created by in0@me.com on 2019/10/21 3:55 PM
 */

public class Item43 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("1234");
        int[] arr;

        //lambda
        arr = list.stream().mapToInt(str -> Integer.parseInt(str)).toArray();
        //Integer::parseInt
        arr = list.stream().mapToInt(Integer::parseInt).toArray();


        list = new ArrayList<String>();
        list.add("abBcdde");
        // str -> str.toLowerCase()
        list.stream().map(str -> str.toLowerCase()).collect(Collectors.toList()).forEach(System.out::println);
        //String::toLowerCase
        list.stream().map(String::toLowerCase).collect(Collectors.toList()).forEach(System.out::println);

    }
}
