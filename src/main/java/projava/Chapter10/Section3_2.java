package projava.Chapter10;

import java.util.stream.IntStream;

public class Section3_2 {
    public static void main(String[] args) {
        String original = "test";
        int count = 3;

        // IntStreamを利用して文字列を繰り返し連結
        String result = IntStream.range(0, count)
                .mapToObj(i -> original) // 各インデックスに対して元の文字列を返す
                .reduce("", String::concat); // すべての文字列を連結

        System.out.println(result);
    }
}

//この問題はよくわからない
//このコードについて理解できるまで調べる。
