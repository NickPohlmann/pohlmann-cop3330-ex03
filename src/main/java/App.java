/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Nicholas Pohlmann
 */

import java.util.Scanner;

public class App {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        App myApp = new App();

        String quote = myApp.readQuote();
        String author = myApp.readAuthor();
        String outputString = myApp.generateOutputString(quote, author);
        myApp.printOutput(outputString);
    }

    private String readQuote() {
        System.out.print("What is the quote? ");
        String quote = in.nextLine();
        return quote;
    }

    private String readAuthor() {
        System.out.print("Who said it? ");
        String author = in.nextLine();
        return author;
    }

    private String generateOutputString(String quote, String author) {
        return author + " says, \"" + quote + "\"";
    }

    private void printOutput(String outputString) {
        System.out.println(outputString);
    }
}
