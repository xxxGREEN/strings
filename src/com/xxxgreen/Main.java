package com.xxxgreen;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
	    final String[] answers = new String[] {
	            "Trinidad & Tobago",
                "Wisconsin",
                "Donald Trump",
                "Alexandra Andresen",
                "42"
        };
	    String[] responses = new String[5];

	    //ask questions, store input in responses[]
        System.out.println("_______ officially eliminated the US Men's National Soccer Team" +
                " from the 2018 World Cup.");
        responses[0] = scanner.nextLine();
        System.out.println("_______ is known as \"America\'s Dairyland\".");
        responses[1] = scanner.nextLine();
        System.out.println("_______ was the oldest person elected President of the United States.");
        responses[2] = scanner.nextLine();
        System.out.println("_______ is the world's youngest billionaire.");
        responses[3] = scanner.nextLine();
        System.out.println("_______ is the meaning of life.");
        responses[4] = scanner.nextLine();

        //compare user responses with answers, count number of matches
        int numCorrect = 0;
        for (int i = 0; i < 5; ++i) {
            if (answers[i].equalsIgnoreCase(responses[i])) {
                ++numCorrect;
            }
        }

        System.out.println("\nYou got " + numCorrect + " out of 5 correct.");
    }
}
