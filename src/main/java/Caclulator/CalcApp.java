package Caclulator;

import java.util.*;

public class CalcApp {
    public static void main(String[] args) {
        String expression = "42 - 63 * 3 * 55 / 5 + 122";
        System.out.println(calc(expression));
    }

    public static int calc(String expression) {

        List<String> stringList2 = new ArrayList<>();
        Collections.addAll(stringList2, expression.trim().split(" "));

        while (stringList2.size() != 0) {
            int result = 0;

            if (stringList2.contains("*")) {
                int index = stringList2.indexOf("*");
                result = Integer.parseInt(stringList2.get(index - 1)) * Integer.parseInt(stringList2.get(index + 1));
                stringList2.add(index - 1, String.valueOf(result));
                stringList2.remove(index + 2);
                stringList2.remove(index + 1);
                stringList2.remove(index);
            } else if (stringList2.contains("/")) {
                int index = stringList2.indexOf("/");
                result = Integer.parseInt(stringList2.get(index - 1)) / Integer.parseInt(stringList2.get(index + 1));
                stringList2.add(index - 1, String.valueOf(result));
                stringList2.remove(index + 2);
                stringList2.remove(index + 1);
                stringList2.remove(index);
            } else if (stringList2.contains("-")) {
                int index = stringList2.indexOf("-");
                result = Integer.parseInt(stringList2.get(index - 1)) - Integer.parseInt(stringList2.get(index + 1));
                stringList2.add(index - 1, String.valueOf(result));
                stringList2.remove(index + 2);
                stringList2.remove(index + 1);
                stringList2.remove(index);
            } else if (stringList2.contains("+")) {
                int index = stringList2.indexOf("+");
                result = Integer.parseInt(stringList2.get(index - 1)) + Integer.parseInt(stringList2.get(index + 1));
                stringList2.add(index - 1, String.valueOf(result));
                stringList2.remove(index + 2);
                stringList2.remove(index + 1);
                stringList2.remove(index);
            }
            if ((!stringList2.contains("*")) && (!stringList2.contains("/")) && (!stringList2.contains("+")) && (!stringList2.contains("-"))) {
                return result;
            }
        }
        return Integer.parseInt(stringList2.toString());
    }
}