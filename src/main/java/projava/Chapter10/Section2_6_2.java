package projava.Chapter10;

import java.util.List;

public class Section2_6_2 {
    public static void main(String[] args) {
        var fruits = List.of("apple", "banana", "orange", "pineapple");

        int totalLength = fruits.stream()
                .filter(s -> s.length() >=6)
                .mapToInt(String::length)
                .sum();

        System.out.println("6文字以上のものの文字数の合計:" + totalLength);
    }
}
