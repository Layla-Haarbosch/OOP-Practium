package P4A;

public class Huis {
    private String adres;
    private int bouwjaar;
    private Persoon huisbaas;

    public Huis(String adr, int bwjr) {
        this.adres = adr;
        this.bouwjaar = bwjr;
    }

    public Persoon getHuisbaas() {
        return huisbaas;
    }

    public void setHuisbaas(Persoon hb) {
        this.huisbaas = hb;
    }

    @Override
    public String toString()
    {
        return "Huis " + this.adres + " is gebouwd in " + this.bouwjaar + "\nen heeft huisbaas " + this.huisbaas;
    }
}
