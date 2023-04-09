package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AntwoordTest {

    @Test
    void antwoordWelOpUurloon() {
        Antwoord antwoord = new Antwoord();
        assertEquals("Uw huidige uurloon is 25 euro per uur", antwoord.Antwoord("zit het woord uurloon in"));
    }
    @Test
    void antwoordNietOpUurloon() {
        Antwoord antwoord = new Antwoord();
        assertEquals("sorry die vraag begrijp ik niet", antwoord.Antwoord("zit het woord uruloob in"));
    }
    @Test
    void antwoordWelopVoordelen(){
        Antwoord antwoord = new Antwoord();
        assertNotEquals("sorry die vraag begrijp ik niet", antwoord.Antwoord("voordelen"));
    }
    @Test
    void antwoordWelOpReisVergoeding(){
        Antwoord antwoord = new Antwoord();
        assertEquals("De reiskostenvergoeding is 0,25 euro per kilometer boven de 25", antwoord.Antwoord("in de vraag staat het woord: reiskostenvergoeding ."));
    }
    @Test
    void antwoordNietOpReisVergoeding(){
    Antwoord antwoord = new Antwoord();
    assertEquals("sorry die vraag begrijp ik niet", antwoord.Antwoord("in de vraag staat geen enkel woord."));
}
}
