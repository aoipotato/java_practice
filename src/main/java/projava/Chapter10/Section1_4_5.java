package projava.Chapter10;

import java.util.List;

public class Section1_4_5 {
    public static void main(String[] args) {
        var data = List.of("apple","banana", "grape");

        boolean found = false;

        for (var s : data){
            if (s.length() == 5 && s.contains("p")) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("5文字ちょうどで「p」を含む文字列が1つ以上見つかりました。");
        } else {
            System.out.println("5文字ちょうどで「p」を含む文字列は見つかりませんでした");
        }
    }
}
