package practicum.p6b.o2;

import practicum.p6a.Game;
import practicum.p6b.Persoon;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Persoon p1 = new Persoon("Henk", 120.00);
        Game g1 = new Game("Super Mario Bros Wonder", 2023, 59.99);
        p1.koop(g1);

        ArrayList<Game> teKoop = new ArrayList<>();
        teKoop.add(new Game("Mario Kart 8", 2019, 35.00));
        teKoop.add(g1);
        ArrayList<Game> nogNietInBezit = p1.bepaalGamesNietInBezit(teKoop);
        System.out.println("p1 heeft de volgende games nog niet: " + nogNietInBezit.toString());
    }
}
