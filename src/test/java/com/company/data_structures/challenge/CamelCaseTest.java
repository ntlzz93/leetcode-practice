package com.company.data_structures.challenge;

import java.util.Scanner;

public class CamelCaseTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter(";|\n");

        while (scanner.hasNext()) {
            String operator = scanner.next().toUpperCase();
            String type = scanner.next().toUpperCase();
            String name = scanner.next();

            if ("S".equals(operator)) {
                name = splitString(name);
            } else if ("C".equals(operator)) {
                name = compileString(name, type);
            }

            System.out.println(name);
        }
        scanner.close();
    }

    private static String splitString(String name) {
        String[] words = name.split("(?=[A-Z])");
        return String.join(" ", words).replace("()", "").toLowerCase();
    }

    private static String compileString(String name, String type) {
        String[] words = name.split(" ");
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            result.append(i == 0 ? word.toLowerCase() : capitalize(word));
        }
        if (type.equals("M")) {
            result.append("()");
        } else if (type.equals("C")) {
            result.setCharAt(0, Character.toUpperCase(result.charAt(0)));
        }
        return result.toString();
    }

    private static String capitalize(String word) {
        return Character.toUpperCase(word.charAt(0)) + word.substring(1).toLowerCase();
    }

}
