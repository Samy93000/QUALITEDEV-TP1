import org.example.StatistiqueIMPL;
import org.example.Voiture;
import org.junit.jupiter.api.Test;

import java.util.Objects;

import static org.junit.jupiter.api.Assertions.*;

public class VoitureTest {
    private final Voiture voiture = new Voiture("Porche", 300);
    private final Voiture voiture2 = new Voiture("Porche2", 300);

    private final StatistiqueIMPL statistiqueIMPL = new StatistiqueIMPL();
    private final StatistiqueIMPL statistiqueIMPL2 = new StatistiqueIMPL();

    @Test
    void testVoiture(){
        assertEquals("Porche", voiture.getMarque());
        assertEquals(300, voiture.getPrix());
    }

    @Test
    void testVoitures(){
        assertAll("voitures",
                ()-> assertTrue(Objects.equals(voiture.getMarque(), "Porche") && voiture.getPrix() == 300),
                ()-> assertTrue(Objects.equals(voiture2.getMarque(), "Porche2") && voiture2.getPrix() == 300)
                );
    }
}
