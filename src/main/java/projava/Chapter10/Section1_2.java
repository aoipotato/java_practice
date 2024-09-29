package projava.Chapter10;

import java.util.List;

public class Section1_2 {
    public static void main(String[] args) {
        var names = List.of("yusuke", "kis", "sugiyama");
        for (String name : names) {
            System.out.println(name);
        }
    }
}
