package practicum.p6a;

import java.util.ArrayList;
import java.util.Locale;

public class Persoon {
    private String naam;
    private double budget;
    private ArrayList<Game> mijnGames = new ArrayList<>();

    public Persoon(String nm, double bud) {
        this.naam = nm;
        this.budget = bud;
    }

    public double getBudget() {
        return this.budget;
    }

    public boolean koop(Game g) {
        if (!mijnGames.contains(g) &&
            this.budget >= g.huidigeWaarde()) {
            mijnGames.add(g);
            return true;
        }

        return false;
    }

    public boolean verkoop(Game g, Persoon koper) {
        if (!koper.mijnGames.contains(g)) {
            if (this.mijnGames.contains(g) &&
                koper.budget >= g.huidigeWaarde()) {
                System.out.println(g.huidigeWaarde());
                koper.mijnGames.add(g);
                return true;
            }
        }

        return false;
    }

    @Override
    public String toString() {
        String prijs = String.format(Locale.GERMAN, "%.2f", this.budget);

        String result = this.naam + " heeft een budget van €" + prijs + " en bezit de volgende games:\n";

        for (Game g : this.mijnGames) {
            result += g.toString() + "\n";
        }

        return result;
    }
}
