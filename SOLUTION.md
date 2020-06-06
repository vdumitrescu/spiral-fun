### Spiral Fun Solution

Each ring of locations can be _walked_ by performing a sequence of steps. For the ring with size N, the steps are:
- go right once (coming from the previous ring);
- go up N-2 times;
- go left N-1 times;
- go down N-1 times;
- go right N-1 times;

For example, the first ring around location 1 has size 3, and the steps are:
- right once (to location 2);
- up once (to location 3);
- left twice (through location 4, to location 5);
- down twice (through location 6, to location 7);
- right twice (through location 8, to location 9);

Using a system of coordinates centred in location 1, we can find the coordinates of any given location by following the steps, going through each ring. The only thing we need are the coordinates for the given location, as the Manhattan distance for that location is calculated by adding the absolute values of the `X` and `Y` coordinates.

My solution uses a `Stream` to build the sequence of steps, and then follows the directions until it reaches the given location.