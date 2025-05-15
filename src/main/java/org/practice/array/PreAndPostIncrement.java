package org.practice.array;

import java.util.ArrayList;
import java.util.List;

public class PreAndPostIncrement {
    public static void main(String[] args) {
        test();
    }

    public static void test() {
        List<Integer> list = new ArrayList<>(2);
        list.add(1);
        list.add(2);
        list.add(3);

        list.forEach( i -> System.out.println(i++ + ++i + "!!!"));
    }
}
