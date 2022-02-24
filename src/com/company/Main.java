package com.company;

import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Decoder Telegram = new Decoder();

        Scanner scan = new Scanner(System.in);
        String input = "";
        System.out.println("Morse Code translator initiated, activate CAPS on your keyboard.");

        do {
            input = scan.nextLine();
            String morseValue = (Telegram.getMorseCode(input));

            if (morseValue == (null) && !Objects.equals(input, "STOP")) {
                System.out.println("Please use capital letters");

            } else if (!input.equals("STOP"))

                System.out.println(morseValue);

        } while (!input.equals("STOP"));

        if (input.equals("STOP"))
            System.out.println("Shutting off");

    }
}
