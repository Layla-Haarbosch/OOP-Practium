package practicum.p5;

public class Leerling {
    private String naam;
    private double cijfer;

    public Leerling(String nm) {
       this.naam = nm;
       this.cijfer = 0.0;
    }

    public String getNaam() {
        return this.naam;
    }

    public double getCijfer() {
        return this.cijfer;
    }

    public void setCijfer(double c) {
        this.cijfer = c;
    }

    @Override
    public String toString() {
        return this.naam + " heeft cijfer: " + this.cijfer + "\n";
    }
}
