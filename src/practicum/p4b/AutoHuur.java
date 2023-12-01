package practicum.p4b;

public class AutoHuur {
    private int aantalDagen;
    private Klant huurder;
    private Auto gehuurdeAuto;

    // we hoeven geen null-argument constructor te maken, want deze bestaat al

    public void setAantalDagen(int aD) {
        this.aantalDagen = aD;
    }

    public int getAantalDagen() {
        return aantalDagen;
    }

    public void setGehuurdeAuto(Auto gA) {
        this.gehuurdeAuto = gA;
    }

    public Auto getGehuurdeAuto() {
        return gehuurdeAuto;
    }

    public void setHuurder(Klant k) {
        this.huurder = k;
    }

    public Klant getHuurder() {
        return huurder;
    }

    public double totaalPrijs()
    {
        if (this.gehuurdeAuto != null && this.huurder != null)  {
            double korting = this.huurder.getKorting();
            double prijsZonderKorting = this.gehuurdeAuto.getPrijsPerDag() * aantalDagen;

            return prijsZonderKorting - (prijsZonderKorting * (korting / 100));
        }
        return 0.0;
    }

    @Override
    public String toString() {
        String gehuurdeAuto = this.gehuurdeAuto != null ? this.gehuurdeAuto.toString() : "er is geen auto bekend";
        String huurder = this.huurder != null ? this.huurder.toString() : "er is geen huurder bekend";

        return gehuurdeAuto + "\n" + huurder + "\naantal dagen: " + this.aantalDagen + " en dat kost " + this.totaalPrijs();
    }
}
