package com.epam.mjc;

import java.util.ArrayList;
import java.util.List;

public class InterfaceCreator {

    public Operation<Integer> divideBy(Integer divider) {
        return (List<Integer>arg)->{
            ArrayList<Integer>result=new ArrayList<>();
            for (Integer integer : arg) {
                result.add(integer / divider);
            }
        return result;
        };
    }
}
