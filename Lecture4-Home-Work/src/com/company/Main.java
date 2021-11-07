package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String data;
        String filter;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter at least three words separated by commas.");
        data = scanner.nextLine();

        String[] words = data.split(",");

        while (true) {
            System.out.println("Please choose a filter:"
                    + "\n1 - maximum length"
                    + "\n2 - start with"
                    + "\n3 - end with"
                    + "\n4 - contains"
                    + "\n0 - exit");
            filter = scanner.nextLine();
            String searchParam;
            System.out.print("Please specify ");

            if (filter.equals("1")) {
                System.out.println("maximum length");
                searchParam = scanner.nextLine();
            } else if (filter.equals("2")) {
                System.out.println("the first letter");
                searchParam = scanner.nextLine();
            } else if (filter.equals("3")) {
                System.out.println("the last letter");
                searchParam = scanner.nextLine();
            } else if (filter.equals("4")) {
                System.out.println("part of the word");
                searchParam = scanner.nextLine();
            } else if (filter.equals("0")) {
                break;
            } else {
                System.out.println("Please use only supported filters.");
                continue;
            }

            System.out.println("Results: ");

            for (String word : words) {
                word = word.trim();

                if (filter.equals("1") && word.length() <= Integer.parseInt(searchParam)) {
                    System.out.println(word);
                } else if (filter.equals("2") && word.startsWith(searchParam)) {
                    System.out.println(word);
                } else if (filter.equals("3") && word.endsWith(searchParam)) {
                    System.out.println(word);
                } else if (filter.equals("4") && word.contains(searchParam)) {
                    System.out.println(word);
                }
            }

            System.out.print("\n");
        }
    }
}

