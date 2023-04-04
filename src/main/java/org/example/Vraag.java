package org.example;

import java.util.Scanner;

class Vraag {
    public String vraag;
    Gebruiker gebruiker;

    public Vraag(Gebruiker gebruiker, String vraag) {
        this.gebruiker = gebruiker;
        this.vraag = vraag;
    }
}
