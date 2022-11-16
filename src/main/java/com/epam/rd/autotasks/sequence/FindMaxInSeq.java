package com.epam.rd.autotasks.sequence;
import java.util.Scanner;

public class FindMaxInSeq {
    public static int max() {
        Scanner scan = new Scanner(System.in);
        int maxSoFar = scan.nextInt();
        int currValue;
        do {
            currValue = scan.nextInt();
            if (currValue > maxSoFar && currValue != 0) {
                maxSoFar = currValue;
            }
        } while (currValue != 0);
        return maxSoFar;
    }

    public static void main(String[] args) {

        System.out.println("Test your code here!\n");

        // Get a result of your code

        System.out.println(max());
    }
}
