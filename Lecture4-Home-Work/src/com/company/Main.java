package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String data;
        String filter = null;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter at least three words separated by commas.");
        data = scanner.nextLine();

        String[] words = data.split(",");
        Integer searchPar = 0;
        String searchParam = null;
        do {
            System.out.println("Please choose a filter:"
                    + "\n1 - maximum length"
                    + "\n2 - start with"
                    + "\n3 - end with"
                    + "\n4 - contains"
                    + "\n0 - exit");
            filter = scanner.nextLine();

            if (filter.equals("1")) {
                System.out.println("Please specify the maximum length");
                while (!scanner.hasNextInt())
                {
                    System.out.println("Not number. Please enter valid number;");
                    scanner.nextLine();
                }
                searchParam = scanner.nextLine();
            } else if (filter.equals("2")) {
                System.out.println("Please specify the first letter");
                searchParam = scanner.nextLine();
            } else if (filter.equals("3")) {
                System.out.println("Please specify the last letter");
                searchParam = scanner.nextLine();
            } else if (filter.equals("4")) {
                System.out.println("Please specify part of the word");
                searchParam = scanner.nextLine();
            } else if (filter.equals("0")) {
                System.out.println("Exit");
            } else {
                System.out.println("Please use only supported filters.");
                continue;
            }

            for (String word : words) {
                word = word.trim();

                if (filter.equals("1") && word.length() <= Integer.parseInt(searchParam)) {
                    System.out.println("Result: " + word);
                } else if (filter.equals("2") && word.startsWith(searchParam)) {
                    System.out.println("Result: " + word);
                } else if (filter.equals("3") && word.endsWith(searchParam)) {
                    System.out.println("Result: " + word);
                } else if (filter.equals("4") && word.contains(searchParam)) {
                    System.out.println("Result: " + word);
                } else if (filter.equals("0")){
                    break;   
                }

            }

            System.out.print("\n");
        }
        while (!filter.equals("0"));
    }
}

