// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");
package example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Write a function:
 * <p>
 * class Solution { public int solution(int[] A); }
 * <p>
 * that, given an array A of N integers, returns the smallest positive integer (greater than 0) that does not occur in A.
 * <p>
 * For example, given A = [1, 3, 6, 4, 1, 2], the function should return 5.
 * <p>
 * Given A = [1, 2, 3], the function should return 4.
 * <p>
 * Given A = [−1, −3], the function should return 1.
 * <p>
 * Write an efficient algorithm for the following assumptions:
 * <p>
 * N is an integer within the range [1..100,000];
 * each element of array A is an integer within the range [−1,000,000..1,000,000].

 */
class Solution {
    public int solution(int[] intArray) {
        // write your code in Java SE 8
        if (intArray.length == 0) return 1;

        ArrayList<Integer> integerArray = (ArrayList<Integer>) Arrays.stream(intArray).boxed().collect(Collectors.toList());
        Stream<Integer> distinct =
                integerArray.parallelStream().filter(p -> p > 0).sorted().distinct();
        try (IntStream intStream = distinct.mapToInt(p -> p)) {

            int[] objects = intStream.toArray();
            if (objects.length == 0) return 1;
            int prev = objects[0];
            for (int i = 0; i < objects.length; i++) {
                int current = objects[i];
                if ((current - prev) > 1) {
                    return prev + 1;
                }
                prev = current;
            }
            return prev + 1;
        }

    }
}
