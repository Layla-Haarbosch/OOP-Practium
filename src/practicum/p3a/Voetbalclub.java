package practicum.p3a;

public class Voetbalclub
{
    private final String naam;
    private int aantalGewonnen = 0;
    private int aantalGelijk = 0;
    private int aantalVerloren = 0;

    public Voetbalclub(String naam)
    {
        if (naam == null || naam.isEmpty()) {
            this.naam = "FC";
        } else {
            this.naam = naam;
        }
    }

    public String getNaam() {
        return this.naam;
    }

    public void verwerkResultaat(char ch) {
        if (ch == 'w') {
            aantalGewonnen = aantalGewonnen + 1;
        }
        if (ch == 'g') {
            aantalGelijk = aantalGelijk + 1;
        }
        if (ch == 'v') {
            aantalVerloren = aantalVerloren + 1;
        }
    }

    public int aantalPunten()
    {
        return (this.aantalGewonnen * 3) + this.aantalGelijk;
    }

    public int aantalGespeeld()
    {
        return this.aantalGewonnen + this.aantalGelijk + this.aantalVerloren;
    }

    @Override
    public String toString()
    {
        return this.naam + "\t" + this.aantalGespeeld() + " " + this.aantalGewonnen + " " + this.aantalGelijk + " " + this.aantalVerloren + " " + this.aantalPunten();
    }
}