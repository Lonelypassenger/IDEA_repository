package com.kejia.sample;

import java.util.stream.IntStream;

/**
 * @AUTHOR :yuankejia
 * @DESCRIPTION:
 * @DATE:CRETED: IN 18:47 2019/9/3
 * @MODIFY:
 */
public class Test {
    public static void main(String[] args) {
        IntStream.range(0,10).filter(i->i%2==0).forEach(System.out::print);
    }
}
