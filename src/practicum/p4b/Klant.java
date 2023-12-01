package practicum.p4b;

public class Klant {
    private String naam;
    private double kortingsPercentage = 0.0;

    public Klant(String nm) {
        this.naam = nm;
    }

    public void setKorting(double kP) {
        this.kortingsPercentage = kP;
    }

    public double getKorting() {
        return this.kortingsPercentage;
    }

    @Override
    public String toString() {
        return "op naam van: " + this.naam + " (korting: " + this.kortingsPercentage + "%)";
    }
}
