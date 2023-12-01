package practicum.p5;

import java.util.*;

public class Klas {
    private String klasCode;
    private ArrayList<Leerling> deLeerlingen = new ArrayList<Leerling>();

    public Klas(String kC) {
        this.klasCode = kC;
    }

    public void voegLeerlingToe(Leerling l) {
        this.deLeerlingen.add(l);
    }

    public void wijzigCijfer(String nm, double nweCijfer)
    {
        for (Leerling leerling : deLeerlingen) {
            if (Objects.equals(leerling.getNaam(), nm)) {
                leerling.setCijfer(nweCijfer);
            }
        }
    }

    public ArrayList<Leerling> getLeerlingen()
    {
        return this.deLeerlingen;
    }

    public int aantalLeerlingen()
    {
        return this.deLeerlingen.size();
    }

    @Override
    public String toString() {
        StringBuilder leerlingen = new StringBuilder();

        for (Leerling leerling : this.deLeerlingen) {
            leerlingen.append(leerling.toString());
        }

        return "In de klas " + this.klasCode + " zitten de volgende leerlingen:\n" + leerlingen;
    }
}
