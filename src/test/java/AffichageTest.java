import static org.junit.jupiter.api.Assertions.*;

class AffichageTest {

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        System.out.println("Exécution de la méthode 'setUp'");
    }
    @org.junit.jupiter.api.AfterEach
    void tearDown() {
        System.out.println("Exécution de la méthode 'tearDown'");
    }
    @org.junit.jupiter.api.Test
    void incVal() {
        System.out.println("Test de la méthode 'incVal'");
    }

    @org.junit.jupiter.api.Test
    void getWidth() {
    }

    @org.junit.jupiter.api.Test
    void getHeight() {
    }

    @org.junit.jupiter.api.Test
    void getGraphics() {
    }

    @org.junit.jupiter.api.Test
    void repaint() {
    }

    @org.junit.jupiter.api.Test
    void setTitle() {
    }
}