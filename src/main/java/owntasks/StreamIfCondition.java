package owntasks;

import java.util.Arrays;
import java.util.List;
public class StreamIfCondition {
        public static void main(String[] args) {
            List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
            // Filter even numbers
            numbers.stream()
                    .filter(num -> num % 2 == 0)// Apply the if condition: num % 2 == 0
            .forEach(System.out::println); // Print the filtered numbers
        }
    }