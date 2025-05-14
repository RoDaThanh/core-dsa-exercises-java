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

        for (int i = 0; i < list.size(); i++) {
            int res = list.get(i);
            res = res++ + ++res;
            System.out.println(res +"!!!");
        }
    }
}
