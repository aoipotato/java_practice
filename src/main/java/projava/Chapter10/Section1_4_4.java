package projava.Chapter10;

import java.util.List;

public class Section1_4_4 {
    public static void main(String[] args) {
        var data = List.of("apple","banana", "grape");

        boolean allContainP = true;

        for (var s : data){
            if (s.length() == 5 && !s.contains("p")) {
                allContainP = false;
            }
        }

        if (allContainP) {
            System.out.println("5文字ちょうどの文字列はすべて「p」を含んでいます。");
        } else {
            System.out.println("5文字ちょうどの文字列の中に「p」を含まないものがあります。");
        }
    }
}
