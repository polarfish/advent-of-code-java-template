import java.util.Arrays;

public class Day0 extends Day {

    Day0() {
        super(0, "Sum of squares", "Sum of cubes");
    }

    public static void main(String[] args) {
        new Day0().solve();
    }


    @Override
    long part1(String input) {
        return Arrays.stream(input.split("\n"))
            .mapToInt(Integer::parseInt)
            .map(i -> i * i)
            .sum();
    }

    long part2(String input) {
        return Arrays.stream(input.split("\n"))
            .mapToInt(Integer::parseInt)
            .map(i -> i * i * i)
            .sum();
    }
}
