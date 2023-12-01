package practicum.p4a;

public class Persoon {
    private String naam;
    private int leeftijd;

    public Persoon(String nm, int lft) {
        this.naam = nm;
        this.leeftijd = lft;
    }

    @Override
    public String toString()
    {
        return this.naam + "; leeftijd " + this.leeftijd + " jaar";
    }
}
