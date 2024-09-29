package projava.Chapter10;

import java.util.List;

public class Section2_6_3 {
    public static void main(String[] args) {
        var fruits = List.of("apple", "banana", "orange", "pineapple");

        boolean allContainA = fruits.stream()
                .allMatch(s -> s.contains("a"));

        System.out.println("すべての文字列が「a」を含んでいるか: " + allContainA);
    }
}
