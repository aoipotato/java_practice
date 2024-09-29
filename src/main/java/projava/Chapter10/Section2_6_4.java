package projava.Chapter10;

import java.util.List;

public class Section2_6_4 {
    public static void main(String[] args) {
        var fruits = List.of("apple", "banana", "orange", "pineapple");

        boolean anyContainC = fruits.stream()
                .anyMatch(s -> s.contains("c"));

        System.out.println("「c」を含むものが1つでもあるか: " + anyContainC);
    }
}
