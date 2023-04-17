package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        boolean nogEenVraag = true;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Voer uw naam in:");
        Gebruiker gebruiker = new Gebruiker(scanner.nextLine());
        System.out.print("Hallo "+ gebruiker.naam+" stel een vraag : ");
        String vraagGebruiker = scanner.nextLine().toLowerCase();
        Antwoord a = new Antwoord();
        System.out.println(a.Antwoord(vraagGebruiker));
        nogeenvraag nogeenvraag = new nogeenvraag(scanner);
        scanner.close();

    }
}
