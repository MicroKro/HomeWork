package Lessons;

import java.util.ArrayList;
import java.util.List;

public class Lesson10 {
    public static void newList() {

        List<String> month = new ArrayList<>();
        month.add("May");
        month.add("April");
        month.add("December");

        System.out.println(month);
    }
    public static void checkCash() {
        int cash = 100;
        String result = cash > 60 ? "Покупка успешна":"Недостаточно средств";

        System.out.println(result);
    }
}
