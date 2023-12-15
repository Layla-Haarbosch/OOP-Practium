package practicum.p6a;

import java.time.LocalDate;
import java.util.Locale;

public class Game {
    private String naam;
    private int releaseJaar;
    private double nieuwprijs;

    public Game(String nm, int rJ, double nwpr) {
        this.naam = nm;
        this.releaseJaar = rJ;
        this.nieuwprijs = nwpr;
    }

    public String getNaam() {
        return this.naam;
    }

    public double huidigeWaarde() {
        int verschil = LocalDate.now().getYear() - this.releaseJaar;

        double prijs = nieuwprijs;

        for (int i = 0; i < verschil; i++) {
            prijs -= (prijs * 0.3);
        }
        return prijs;
    }

    @Override
    public boolean equals(Object andereObject) {
        if (andereObject instanceof Game game) {

            if (this.getNaam().equals(game.getNaam()) &&
                this.releaseJaar == game.releaseJaar) {
                return true;
            }
        }

        return false;
    }

    @Override
    public String toString() {
        String prijs = String.format(Locale.GERMAN, "%.2f", this.nieuwprijs);
        String huidigePrijs = String.format(Locale.GERMAN, "%.2f", this.huidigeWaarde());
        return this.getNaam() + ", uitgegeven in " + this.releaseJaar + "; nieuwprijs: €" + prijs + " nu voor: €" + huidigePrijs;
    }
}
