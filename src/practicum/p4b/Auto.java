package practicum.p4b;

public class Auto {
    private String type;
    private double prijsPerDag;

    public Auto(String tp, double prPd) {
        this.type = tp;
        this.prijsPerDag = prPd;
    }

    public double getPrijsPerDag() {
        return prijsPerDag;
    }

    public void setPrijsPerDag(double prPd) {
        this.prijsPerDag = prPd;
    }

    @Override
    public String toString() {
        return "autotype: " + this.type + " met prijs per dag: " + this.prijsPerDag;
    }
}
