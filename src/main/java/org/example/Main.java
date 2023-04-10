package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Voer uw naam in:");
        Gebruiker gebruiker = new Gebruiker(scanner.nextLine());
        System.out.print("Hallo "+ gebruiker.naam+" stel een vraag : ");
        String vraagGebruiker = scanner.nextLine().toLowerCase();
        boolean nogeenvraag = true;
        Antwoord a = new Antwoord();
        System.out.println(a.Antwoord(vraagGebruiker));
        while (nogeenvraag) {
            System.out.println("Wilt u nog een vraag stellen? [ja] [nee]");
            vraagGebruiker = scanner.nextLine().toLowerCase();
            if (vraagGebruiker.contains("ja")) {
                System.out.print("Stel een vraag: ");
                vraagGebruiker = scanner.nextLine().toLowerCase();
                System.out.println(a.Antwoord(vraagGebruiker));
            } else if (vraagGebruiker.contains("nee")) {
                System.out.println("dankuwel voor het gebruiken van de chatbot");
                nogeenvraag = false;
            } else {
                System.out.println("typ [ja] of [nee] in");
            }
        }

            scanner.close();

    }
}
