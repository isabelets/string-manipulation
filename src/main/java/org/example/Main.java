package org.example;
import java.util.Scanner;

public class Main {
    public static String reverseWord() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma palavra para ficar ao contrário...");
        String word = scanner.nextLine();

        String reversedWord = "";
        for(int i = word.length() -1; i >= 0; i--){
            reversedWord += word.charAt(i);
        }

        System.out.println("Palavra ao contrário: " + reversedWord);
        return reversedWord;
    }
}