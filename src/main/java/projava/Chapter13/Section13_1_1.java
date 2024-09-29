package projava.Chapter13;

public class Section13_1_1 {
    public static void main(String[] args) {
        var data = "abcde";

        var builder = new StringBuilder();

        for (int i = 0; i < data.length(); i += 2) {
            char currentChar = data.charAt(i);
            if (i + 1 < data.length()) {
                char nextChar = data.charAt(i + 1);

                builder.append(nextChar);
                builder.append(currentChar);
            } else {
                builder.append(currentChar);
            }
        }
        var result = builder.toString();
        System.out.println(data);
        System.out.println(result);
    }
}

// 理解していない