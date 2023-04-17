package org.example;

import java.util.Scanner;

public class nogeenvraag {
    Antwoord antwoord = new Antwoord();

    public nogeenvraag(Scanner scanner) {
        boolean nogeenvraag = true;
        while (nogeenvraag) {
            System.out.println("Wilt u nog een vraag stellen? [ja] [nee]");
            String invoer = scanner.nextLine().toLowerCase();
            if (invoer.contains("ja")) {
                System.out.println("Stel een vraag: ");
                invoer = scanner.nextLine().toLowerCase();
                System.out.println(antwoord.Antwoord(invoer));
            } else if (invoer.contains("nee")) {
                System.out.println("dankuwel voor het gebruiken van de chatbot");
                nogeenvraag = false;
            } else {
                System.out.println("typ [ja] of [nee] in");
            }

        }
    }
}
