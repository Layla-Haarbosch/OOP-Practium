package practicum.p4b;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class AutoHuurTest {
    private AutoHuur autoHuur;

    @BeforeEach
    void init() {
        this.autoHuur = new AutoHuur();
    }

    @Test
    void testHuurderDeVriesHuurAutoPeugeot207Korting10_deVries() {
        Klant k = new Klant("Mijnheer de Vries");
        Auto a = new Auto("Peugeot 207", 50);

        k.setKorting(10.0);
        this.autoHuur.setGehuurdeAuto(a);
        this.autoHuur.setHuurder(k);

        assertTrue(this.autoHuur.toString().contains("op naam van: Mijnheer de Vries"));
    }

    @Test
    void testHuurderDeVriesHuurAutoPeugeot207Korting10_Peugeot207() {
        Klant k = new Klant("Mijnheer de Vries");
        Auto a = new Auto("Peugeot 207", 50);

        k.setKorting(10.0);
        this.autoHuur.setGehuurdeAuto(a);
        this.autoHuur.setHuurder(k);

        assertTrue(this.autoHuur.toString().contains("autotype: Peugeot 207"));
    }

    @Test
    void testHuurderDeVriesHuurAutoPeugeot207Korting10_Korting10() {
        Klant k = new Klant("Mijnheer de Vries");
        Auto a = new Auto("Peugeot 207", 50);

        k.setKorting(10.0);
        this.autoHuur.setGehuurdeAuto(a);
        this.autoHuur.setHuurder(k);

        assertTrue(this.autoHuur.toString().contains("korting: 10.0%"));
    }

    @Test
    void testHuurderDeVriesHuurAutoFerrariKorting10_Ferrari() {
        Klant k = new Klant("Mijnheer de Vries");
        Auto a = new Auto("Ferrari", 3500);

        k.setKorting(10.0);
        this.autoHuur.setGehuurdeAuto(a);
        this.autoHuur.setHuurder(k);

        assertTrue(this.autoHuur.toString().contains("autotype: Ferrari"));
    }

    @Test
    void testHuurderDeVriesHuurAutoPeugeot207GeenKorting_Korting0() {
        Klant k = new Klant("Mijnheer de Vries");
        Auto a = new Auto("Peugeot 207", 50);

        this.autoHuur.setGehuurdeAuto(a);
        this.autoHuur.setHuurder(k);
        assertTrue(this.autoHuur.toString().contains("korting: 0.0%"));
    }

    @Test
    void testHuurderDeVriesGeenHuurAutoGeenKorting_deVries() {
        Klant k = new Klant("Mijnheer de Vries");

        this.autoHuur.setHuurder(k);
        assertTrue(this.autoHuur.toString().contains("op naam van: Mijnheer de Vries"));
    }

    @Test
    void testHuurderDeVriesGeenHuurAutoGeenKorting_autoOnbekend() {
        Klant k = new Klant("Mijnheer de Vries");

        this.autoHuur.setHuurder(k);
        assertTrue(this.autoHuur.toString().contains("geen auto bekend"));
    }

    @Test
    void testHuurderDeVriesGeenHuurAutoGeenKorting_Korting0() {
        Klant k = new Klant("Mijnheer de Vries");

        this.autoHuur.setHuurder(k);
        assertTrue(this.autoHuur.toString().contains("korting: 0.0%"));
    }

    @Test
    void testHuurderDeVriesGeenHuurAutoKorting10_Korting10() {
        Klant k = new Klant("Mijnheer de Vries");

        k.setKorting(10.0);
        this.autoHuur.setHuurder(k);
        assertTrue(this.autoHuur.toString().contains("korting: 10.0%"));
    }

    @Test
    void testHuurderDeVriesGeenHuurAutoKorting5_Korting5() {
        Klant k = new Klant("Mijnheer de Vries");

        k.setKorting(5.0);
        this.autoHuur.setHuurder(k);
        assertTrue(this.autoHuur.toString().contains("korting: 5.0%"));
    }

    @Test
    void testGeenHuurderGeenAutoGeenKorting_autoOnbekend() {
        assertTrue(this.autoHuur.toString().contains("geen auto bekend"));
    }

    @Test
    void testGeenHuurderGeenAutoGeenKorting_huurderOnbekend() {
        assertTrue(this.autoHuur.toString().contains("geen huurder bekend"));
    }
}