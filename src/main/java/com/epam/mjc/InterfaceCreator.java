package com.epam.mjc;

import java.util.ArrayList;
import java.util.List;

public class InterfaceCreator {

    public Operation divideBy(Integer divider) {

        return arg -> {

            List<Integer> integers = new ArrayList<>();

            for (Object o : arg) {
                integers.add((Integer) o / divider);
            }
            return integers;
        };

    }
}
