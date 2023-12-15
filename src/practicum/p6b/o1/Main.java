package practicum.p6b.o1;

import practicum.p6a.Game;
import practicum.p6b.Persoon;

public class Main {
    public static void main(String[] args) {
        Persoon p1 = new Persoon("Frank", 100.00);
        Game jc3 = new Game("Just Cause 3", 2015, 49.99);
        p1.koop(jc3);
        Game game1 = p1.zoekGameOpNaam("Just Cause 3");
        System.out.println("p1 heeft Just Cause 3 " + (game1 != null ? "wel!" : "niet!"));
    }
}
