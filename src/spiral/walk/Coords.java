package spiral.walk;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Coords {
    private final int x, y;

    public static Coords ZERO = new Coords(0, 0);

    public Coords(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public static BiFunction<Coords, Direction, Coords>
        go = (from, direction) -> {
            switch (direction) {
                case UP: return new Coords(from.x, from.y - 1);
                case DOWN: return new Coords(from.x, from.y + 1);
                case LEFT: return new Coords(from.x - 1, from.y);
                case RIGHT: return new Coords(from.x + 1, from.y);
            }
            return null;
        };

    public static Function<Coords, Integer>
        calculateDistance = coords -> Math.abs(coords.x) + Math.abs(coords.y);
}
