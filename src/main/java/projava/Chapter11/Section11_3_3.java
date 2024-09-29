package projava.Chapter11;

public class Section11_3_3 {
    public static void main(String[] args) {
        loop(3);
    }

    static void loop (int i) {
        if (i <= 0) {
            return;
        }
        System.out.println(i);
        loop(i - 1);
    }
}
