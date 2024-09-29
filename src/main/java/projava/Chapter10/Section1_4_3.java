package projava.Chapter10;

import java.util.List;
import java.util.ArrayList;

public class Section1_4_3 {
    public static void main(String[] args) {
        var data = List.of("apple", "banana", "grape");

        var result = 0;
        for (var s : data){
            if (s.length() == 5){
                result++;
            }
        }
        System.out.println(result);
    }
}
