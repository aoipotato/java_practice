package projava.Chapter10;

import java.util.List;

public class Section1_1 {
    public static void main(String[] args) {
        var names = List.of("yusuke", "kis", "sugiyama");
        for (int i = 0; i < names.size(); i++) {
            var name = names.get(i);
            System.out.println(name);
        }
    }
}
