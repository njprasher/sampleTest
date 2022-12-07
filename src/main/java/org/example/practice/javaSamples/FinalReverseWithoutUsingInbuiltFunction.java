package org.example.practice.javaSamples;


import java.util.Scanner;

public class FinalReverseWithoutUsingInbuiltFunction {
    public static void main(String[] args) {
        String original;
        StringBuilder reverse = new StringBuilder();
        System.out.println("Enter the string to be reversed");
        Scanner getInput = new Scanner(System.in);
        original = getInput.nextLine();
        int length = original.length();
        for(int i=length-1; i>=0; i--) {
            reverse.append(original.charAt(i));   //used inbuilt method charAt() to reverse the string
        }
        System.out.println(reverse);
    }
}