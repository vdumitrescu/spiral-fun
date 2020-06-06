package spiral.walk;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import spiral.Spiral;

class WalkSpiralTest {

    private final Spiral walk = new WalkSpiral();

    @Test
    void location1() {
        assertEquals(walk.manhattan(1), 0);
    }

    @Test
    void location12() {
        assertEquals(walk.manhattan(12), 3);
    }

    @Test
    void location23() {
        assertEquals(walk.manhattan(23), 2);
    }

    @Test
    void location1024() {
        assertEquals(walk.manhattan(1024), 31);
    }

    @Test
    void location368078() {
        assertEquals(walk.manhattan(368078), 371);
    }
}
