package org.example;

abstract class Vraag {
    protected String Syntax;

    public abstract String antwoordCheck();

    public boolean matches(String invoer) {
        return invoer.matches(Syntax);
    }
}

class Uurloon extends Vraag {
    public Uurloon() {
        this.Syntax = ".*(uurloon|uur loon).*";
    }

    public String antwoordCheck() {
        return "Uw huidige uurloon is 25 euro per uur";
    }
}

class Salaris extends Vraag {
    public Salaris() {
        this.Syntax = ".*salaris.*";
    }

    public String antwoordCheck() {
        return "Uw huidige jaarsalaris is 32000 euro netto.";
    }
}

class Voordelen extends Vraag {
    public Voordelen() {
        this.Syntax = ".*(voordelen|benefits|medewerker).*";
    }

    public String antwoordCheck() {
        return "Wij bieden verschillende voordelen aan, zoals bijvoorbeeld:[voordelen].";
    }
}

class OverwerkBeleid extends Vraag {
    public OverwerkBeleid() {
        this.Syntax = ".*(overwerk|overtime|overuren).*";
    }

    public String antwoordCheck() {
        return "Overwerk/overuren worden anderhalf keer uitbetaald, maar moeten wel eerst goedgekeurd worden door de supervisor.";
    }
}
    class ReisVergoeding extends Vraag{
        public ReisVergoeding(){
            this.Syntax = ".*(reiskosten|reisvergoeding|reiskostenvergoeding).*";
        }
        public String antwoordCheck() {
            return "De reiskostenvergoeding is 0,25 euro per kilometer boven de 25";
        }
    }


