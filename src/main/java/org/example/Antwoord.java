package org.example;

import java.util.ArrayList;

class Antwoord {
    String vraagGebruiker;

    public String Antwoord(String vraagGebruiker) {
        this.vraagGebruiker = vraagGebruiker;
        ArrayList<Vraag> vraagList = new ArrayList<>();
        // vragen initialisatie
        vraagList.add(new Uurloon());
        vraagList.add(new Salaris());
        vraagList.add(new Voordelen());
        vraagList.add(new OverwerkBeleid());
        vraagList.add(new ReisVergoeding());
        boolean vragenCheck = true;
        for (Vraag v : vraagList) {
            if (v.matches(vraagGebruiker)) {
               return v.antwoordCheck();
            }
        }
        return "sorry die vraag begrijp ik niet";
}
}
