package ex31;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Evan Verdu
 */

import java.util.Scanner;

public class ex31 {

    public static void main(String[] Args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Resting pulse: ");
        String pulse = scanner.next();

        if (pulse.matches("[^0-9]+")){
            System.out.print("Please enter a number value for the pulse. ");
            System.exit(0);
        }

        System.out.print("Age: ");
        String age = scanner.next();

        if(age.matches("[^0-9]+")){
            System.out.print("Please enter a number value for the age. ");
            System.exit(0);
        }

        int Age = Integer.parseInt(age);
        int Pulse = Integer.parseInt(pulse);

        System.out.println("\n" + "Intensity    | Rate    \n-------------|--------");

        for (double i = 55; i <= 95 ; i += 5){

            double TargetRate = (((220 - Age) - Pulse) * i/100) + Pulse;
            System.out.println(i + "%        | " + String.format("%.0f", TargetRate) + " bpm");

        }




    }


}
