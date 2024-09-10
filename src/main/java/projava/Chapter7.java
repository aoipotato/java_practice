package projava;

public class Chapter7 {
    public static void main(String[] args) {
        var a = 6;
        if (a < 3) {
            System.out.println("小さい");
        } else if (a < 7) {
            System.out.println("中くらい");
        }else {
            System.out.println("大きい");
        }
    }
}

//switch式
//package projava;
//
//public class Chapter7 {
//    public static void main(String[] args) {
//        var a = 9;
//        System.out.println(switch (a) {
//            case 1,2 -> "one-two";
//            case 3 -> "three";
//            case 4 -> "fou
//            r";
//            default -> "other";
//            });
//    }
//}

//switch文
//         var a = 9;
//         switch (a) {
//          case 1, 2 -> System.out.println("one-two");
//          case 3 -> System.out.println("three");
//          case 4 -> System.out.println("four");
//          case 5 -> System.out.println("five");
//          default -> System.out.println("other");
//        }