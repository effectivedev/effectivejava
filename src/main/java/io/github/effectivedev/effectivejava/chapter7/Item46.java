package io.github.effectivedev.effectivejava.chapter7;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

/**
 * effectivejava
 * Item46
 * Github : https://github.com/effectivedev
 * Created by in0@me.com on 2019/10/21 5:08 PM
 */

public class Item46 {
    public static void main(String[] args) {
        Map<String, Long> freq;
        List<String> list = new ArrayList<>();
        list.add("ABCD");
        list.add("abCd");
        list.add("abcD");
        list.add("abcde");
        list.add("abcd");
        list.add("bcd");
        list.add("bcd");
        list.add("test");
        freq = list.stream().collect(groupingBy(String::toLowerCase, counting()));
        

        List<String> topTen = freq.keySet().stream().sorted(comparing(freq::get).reversed())
                .limit(2).collect(Collectors.toList());
        System.out.println(topTen);
    }
}
