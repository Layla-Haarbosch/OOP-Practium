import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VoetbalclubTest {
    private Voetbalclub vc;

    @BeforeEach
    void init() {
        this.vc = new Voetbalclub("");
    }

    @Test
    void test_ClubNaamLeeg_FC() {
        assertEquals("FC", vc.naam);
    }

    @Test
    void test_ClubNaamNull_FC() {
        Voetbalclub club = new Voetbalclub(null);
        assertEquals("FC", club.naam);
    }

    @Test
    void test_aantalPuntenMetResultaatW_3() {
        vc.verwerkResultaat('w');
        assertEquals(3, vc.aantalPunten());
    }

    @Test
    void test_aantalPuntenMetResultaatG_1() {
        vc.verwerkResultaat('g');
        assertEquals(1, vc.aantalPunten());
    }

    @Test
    void test_aantalPuntenMetResultaatV_0() {
        vc.verwerkResultaat('v');
        assertEquals(0, vc.aantalPunten());
    }

    @Test
    void test_aantalPuntenMetResultaatWInToString_3() {
        vc.verwerkResultaat('w');

        if (vc.aantalPunten() == 3) {
            vc.toString().contains("3");
        }
    }

    @Test
    void test_aantalPuntenMetResultaatGInToString_1() {
        vc.verwerkResultaat('g');

        if (vc.aantalPunten() == 1) {
            vc.toString().contains("1");
        }
    }

    @Test
    void test_aantalPuntenMetResultaatVInToString_0() {
        vc.verwerkResultaat('g');

        if (vc.aantalPunten() == 0) {
            vc.toString().contains("0");
        }
    }

    @Test
    void test_OptellingPuntenMeerdereAanroepingen_7() {
        vc.verwerkResultaat('w');
        vc.verwerkResultaat('w');
        vc.verwerkResultaat('g');
        vc.verwerkResultaat('v');
        vc.verwerkResultaat('v');
        vc.verwerkResultaat('v');

        assertEquals(7, vc.aantalPunten());
    }

    @Test
    void test_OptellingWedstrijdAantallen_5() {
        vc.verwerkResultaat('g');
        vc.verwerkResultaat('g');
        vc.verwerkResultaat('g');
        vc.verwerkResultaat('v');
        vc.verwerkResultaat('w');

        assertEquals(5, vc.aantalGespeeld());
    }
}