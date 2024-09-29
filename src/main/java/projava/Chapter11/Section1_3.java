package projava.Chapter11;

import java.util.List;

public class Section1_3 {
    record Student(String name, int englishScore, int mathScore) {
        int average() {
            return (englishScore() + mathScore()) / 2;
        }

        void showResult() {
            int avg = average();
            System.out.println("%sさんの平均点は%d点です".formatted(name, avg));
        }

        public int maxScore() {
            return Math.max(englishScore(), mathScore());
        }
    }

    public static void main(String[] args) {
        var kis = new Student("kis", 60, 80);
        kis.showResult();


        int max = kis.maxScore();
        System.out.println("最高点は%d点です。".formatted(max));

    }
}