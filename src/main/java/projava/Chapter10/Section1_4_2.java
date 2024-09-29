package projava.Chapter10;

import java.util.ArrayList;
import java.util.List;

public class Section1_4_2 {
    public static void main(String[] args) {
        var data = List.of("apple","banana", "grape");

        var result = new ArrayList<String>();

        for (var dat : data) {
            if (dat.length() == 5) {
                result.add(dat);
            }
        }
        System.out.println(result);
    }
}
