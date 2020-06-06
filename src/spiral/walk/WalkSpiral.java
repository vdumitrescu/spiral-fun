package spiral.walk;

import spiral.Spiral;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static spiral.util.StreamOps.foldLeft;

public class WalkSpiral implements Spiral {

    protected Function<Integer, Coords> findCoordinates = location -> {
        Stream<Direction> directions = IntStream.iterate(3, x -> x + 2)
                .mapToObj(this::loop)
                .flatMap(Function.identity())
                .limit(location - 1);

        return foldLeft(directions, Coords.ZERO, Coords.go);
    };

    protected Stream<Direction> loop(int n) {
        List<Direction> loop = new ArrayList<>();
        loop.add(Direction.RIGHT);
        loop.addAll(Collections.nCopies(n - 2, Direction.UP));
        loop.addAll(Collections.nCopies(n - 1, Direction.LEFT));
        loop.addAll(Collections.nCopies(n - 1, Direction.DOWN));
        loop.addAll(Collections.nCopies(n - 1, Direction.RIGHT));
        return loop.stream();
    }

    @Override
    public int manhattan(int location) {
        return findCoordinates.andThen(Coords.calculateDistance).apply(location);
    }
}
