## Spiral Fun

Create a spiral of integer numbers, starting with 1, and walking in a counter-clockwise spiral, around and around.

```
17 16 15 14 13
18  5  4  3 12
19  6  1  2 11
20  7  8  9 10
21 22 23 ---> ...
```

Create a console application which, given a location number, calculates the [Manhattan distance](https://en.wikipedia.org/wiki/Taxicab_geometry) to the center (location 1).

For example:
- From square/location 1 the distance is 0.
- From location 12 the distance is 3 (down, left, left).
- From location 23 the distance is only 2 (up twice).
- From location 1024 the distance is 31.

How many steps are required to go from location 368078 to the center?

[My solution](SOLUTION.md)