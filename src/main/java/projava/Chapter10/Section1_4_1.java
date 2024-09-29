package projava.Chapter10;

import java.util.List;

public class Section1_4_1 {
    public static void main(String[] args) {
        var data = List.of("apple","banana", "grape");

        for (var s : data) {
            if (s.length() == 5){
                System.out.println(s);
            }
        }
    }
}
