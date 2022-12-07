package org.example.practice.javaSamples;

public class SecondHighestNumberInArray {
    public static void main(String[] args)
    {
        int[] arr = { 100,14, 46, 47, 94, 94, 52, 86, 36, 94, 89 };
        int largest = 0;
        int secondLargest = 0;
        System.out.println("The given array is:");
        for (int j : arr) {
            System.out.print(j + "\t");
        }
        for (int j : arr) {
            if (j > largest) {
                secondLargest = largest;
                largest = j;
            } else if (j > secondLargest) {
                secondLargest = j;
            }
        }
        System.out.println("\nSecond largest number is:" + secondLargest);
        System.out.println("Largest Number is: "  +largest);
    }
}