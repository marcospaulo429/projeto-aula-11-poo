import org.example.TorreDeHanoi;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.Assert.*;

public class TorreDeHanoiTest {

    @Test
    @DisplayName("Testando com um disco")
    public void testTorreDeHanoiComUmDisco() {
        int movimentos = TorreDeHanoi.torreDeHanoi(1, 'A', 'C', 'B');
        assertEquals(1, movimentos);
    }

    @Test
    @DisplayName("Testando com 2 discos")
    public void testTorreDeHanoiComDoisDiscos() {
        int movimentos = TorreDeHanoi.torreDeHanoi(2, 'A', 'C', 'B');
        assertEquals(2, movimentos);
    }

    @Test
    @DisplayName("Testando com 3 discos")
    public void testTorreDeHanoiComTresDiscos() {
        int movimentos = TorreDeHanoi.torreDeHanoi(3, 'A', 'C', 'B');
        assertEquals(4, movimentos);
    }

    @Test
    @DisplayName("Testando com 4 discos")
    public void testTorreDeHanoiComQuatroDiscos() {
        int movimentos = TorreDeHanoi.torreDeHanoi(4, 'A', 'C', 'B');
        assertEquals(8, movimentos);
    }

    @Test
    @DisplayName("Testando com 5 discos")
    public void testTorreDeHanoiComCincoDiscos() {
        int movimentos = TorreDeHanoi.torreDeHanoi(5, 'A', 'C', 'B');
        assertEquals(16, movimentos);
    }

}
