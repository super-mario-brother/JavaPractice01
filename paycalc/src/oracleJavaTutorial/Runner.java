package oracleJavaTutorial;

import java.io.IOException;
import java.util.stream.IntStream;

import static java.lang.Integer.sum;
import static java.util.stream.IntStream.of;
import static java.util.stream.IntStream.range;

public class Runner {
    public static void main(String[] args) throws IOException {

        //streams basics
        IntStream onetofive = range(1, 5);
        onetofive.forEach(System.out::println);
        System.out.println(1+2+3+4);
        System.out.println(onetofive.sum());


    }

}
