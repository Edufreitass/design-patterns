package dev.rinaldo.designpatterns.creational;

import java.text.NumberFormat;
import java.util.Calendar;
import java.util.List;
import java.util.stream.Stream;

public class FactoryMethod_4 {

    public static void main(String[] args) {
        // Static Factory Methods
        Calendar.getInstance();
        NumberFormat.getInstance();
        Stream.of(1, 2, 3, 4);
        List.of(1, 2, 3, 4);
        Integer.valueOf("1234");
    }

}
