package projava.Chapter10;

import java.util.List;

public class Section2_6_1 {
    public static void main(String[] args) {
        var fruits = List.of("apple", "banana", "orange", "pineapple");

        List<String> bigFruit = fruits.stream()
                .filter(s -> s.length() >=6)
                .map(s -> s.toUpperCase())
                .toList();

        System.out.println(bigFruit);
    }
}
