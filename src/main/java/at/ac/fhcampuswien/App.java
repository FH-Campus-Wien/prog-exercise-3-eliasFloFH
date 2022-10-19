package at.ac.fhcampuswien;

import java.util.Random;
import java.util.Scanner;

public class App {

    // Implement all methods as public static

    public static void oneMonthCalender(int numberDays, int startingDay) {

        int countDay = 1;
        StringBuilder initialSpace = new StringBuilder();

        for (int x = 0; x < startingDay - 1; x++) {
            initialSpace.append("   ");
        }

        System.out.print(initialSpace);

        for (int i = 1; i <= numberDays; i++) {

            if (i < 10) {
                System.out.printf("% 2d ", i);
            } else {
                System.out.printf("%2d ", i);
            }

            if (countDay % 7 == 0 && startingDay == 1) {
                System.out.println();
            }



            countDay++;


        }

    }



    public static void main(String[] args) {
        // test your method implementations here
        // make method calls
        // print their results
        // etc.


    oneMonthCalender(31, 1);



    }
}