package com.torres.utils.lombok;

import lombok.val;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Val
 * Created by Torres on 2018-05-23 13:08.
 */

public class Val {

    public String example1() {
//        用在局部变量前面，相当于将变量声明为final
        val example = new ArrayList<String>();
        example.add("Hello, World!");
        val foo = example.get(0);
        System.out.println(foo);
        return foo.toLowerCase();
    }

    public void example2() {
        val map = new HashMap<Integer, String>();
        map.put(0, "zero");
        map.put(5, "five");
        for (val entry : map.entrySet()) {
            System.out.printf("%d: %s\n", entry.getKey(), entry.getValue());
        }
    }

//    java
    public String example11() {
        final ArrayList<String> example = new ArrayList<String>();
        example.add("Hello, World!");
        final String foo = example.get(0);
        return foo.toLowerCase();
    }

    public void example22() {
        final HashMap<Integer, String> map = new HashMap<Integer, String>();
        map.put(0, "zero");
        map.put(5, "five");
        for (final Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.printf("%d: %s\n", entry.getKey(), entry.getValue());
        }
    }

}
