package org.example;

import java.util.ArrayList;
import java.util.Scanner;

class Antwoord {
    private String vraagGebruiker;

    public String Antwoord(String vraagGebruiker) {
        this.vraagGebruiker = vraagGebruiker;
        ArrayList<Vraag> vraagList = new ArrayList<>();
        // vragen initialisatie
        vraagList.add(new Uurloon());
        vraagList.add(new Salaris());
        vraagList.add(new Voordelen());
        vraagList.add(new OverwerkBeleid());
        vraagList.add(new ReisVergoeding());
        for (Vraag v : vraagList) {
            if (v.matches(vraagGebruiker)) {
                return v.antwoordCheck();
            }
        }
        return "sorry die vraag begrijp ik niet";
    }
}

