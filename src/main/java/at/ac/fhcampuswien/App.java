package at.ac.fhcampuswien;

import java.awt.*;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class App {

    // Implement all methods as public static

    // ========== First Exercise ==========
    public static void oneMonthCalendar(int numberDays, int startingDay) {

        int countDay = 1;
        int countNum = 1;
        StringBuilder initialSpace = new StringBuilder();

        for (int x = 0; x < startingDay - 1; x++) {
            initialSpace.append("   ");
            countDay++;
        }

        System.out.print(initialSpace);

        for (int i = 1; i <= numberDays; i++) {

            if (i < 10) {
                System.out.printf("% 2d ", i);
            } else {
                System.out.printf("%2d ", i);
            }

            if (countDay % 7 == 0) {
                System.out.println();
            } else if (countNum == numberDays) {
                System.out.println();
            }

            countDay++;
            countNum++;

        }

    }


    // ========== Second Exercise ==========

    public static long[] lcg(long seed) {


        double doublem = Math.pow(2, 31);
        long m = (long)doublem;
        long a = 1103515245;
        long c = 12345;

        long size = 10;
        long[] arr = new long[(int) size];

        for (long x = 0; x < size; x++) {

            seed = (((a * seed) + c) % m);

            arr[(int) x] = seed;

        }

        System.out.println(Arrays.toString(arr));
        return arr;

    }

    // ========== Third Exercise ==========


    public static void guessingGame(int numberToGuess) {

        int count = 1;

        Scanner scanTask3 = new Scanner(System.in);

        do {
            System.out.print("Guess number " + count + ": ");
            int randomNumber = scanTask3.nextInt();

            if (count == 10) {
                System.out.println("You lost! Have you ever heard of divide & conquer?");
                break;
            }

            if (numberToGuess < randomNumber) {
                System.out.println("The number AI picked is lower than your guess.");
            } else if (numberToGuess > randomNumber) {
                System.out.println("The number AI picked is higher than your guess.");
            } else {
                System.out.println("You won wisenheimer!");
                break;
            }
            count++;

        } while (count <= 10);

    }
    public static int randomNumberBetweenOneAndHundred() {

        int min = 1;
        int max = 100;

        Random randomNumberGenerator2 = new Random();
        return min + randomNumberGenerator2.nextInt(max);
    }

    // ========== Fourth Exercise ==========

    public static boolean swapArrays(int arr1[], int arr2[]) {

        if (arr1.length == arr2.length) {
            int temp;
            for (int x = 0; x < arr1.length; x++) {
                temp = arr1[x];
                arr1[x] = arr2[x];
                arr2[x] = temp;
            }
            return true;
        } else {
            return false;
        }

    }

    // ========== Fifth Exercise ==========

    public static String camelCase(String randomString) {

        char[] character = randomString.toCharArray();
        String start = "";

        int count = 0;

        while (count < character.length) {

            if (count == 0) {
                if ('a' <= character[0] && 'z' >= character[0]) {
                    start = start + (char)(character[0] - 32);
                } else if (character[0] >= 'A' && character[0] <= 'Z') {
                    start = start + character[0];
                } else {
                    continue;
                }
            } else if (character[count] >= 'a' && character[count] <= 'z') {
                if (character[count - 1] == ' ') {
                    start = start + (char)(character[count] - 32);
                } else {
                    start = start + character[count];
                }
            } else if (character[count] >= 'A' && character[count] <= 'Z') {
                if (character[count - 1] != ' ') {
                    start = start + (char)(character[count] + 32);
                } else {
                    start = start + character[count];
                }
            }

            count++;

        }

        return start;
    }

    // ========== Sixth Exercise ==========

    public static int checkDigit(int codeInput[]) {

        int checkCode = 0;
        int countLoop = 0;

        while (countLoop < codeInput.length) {

            checkCode += codeInput[countLoop] * (countLoop + 2);

            countLoop++;
        }

        checkCode = 11 - (checkCode % 11);

        if (checkCode == 10) {
            return  0;
        } else if (checkCode == 11) {
            return 5;
        } else {
            return checkCode;
        }
    }



    public static void main(String[] args) {
        // test your method implementations here
        // make method calls
        // print their results
        // etc.


    oneMonthCalendar(28, 3);

    lcg(0);

    guessingGame(randomNumberBetweenOneAndHundred());

    swapArrays(new int[]{4,3,2}, new int[]{3});

    camelCase("helloworldhowareyou");



    }
}