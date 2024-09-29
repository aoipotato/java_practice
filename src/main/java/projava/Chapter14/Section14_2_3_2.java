package projava.Chapter14;

    interface Figure {
        int width();
        int height();
    }

    record Box(int width, int height) implements Figure {}

    record Oval(int width, int height) implements Figure {}


//    public class Section14_2_3_2 {
//        public static void main(String[] args) {
//            Figure box = new Box(4, 5);
//            Figure oval = new Oval(6, 3);
//
//            System.out.println("Box Width: " + box.width() + ", Height: " + box.height());
//            System.out.println("Oval Width: " + oval.width() + ", Height: " + oval.height());
//        }
//    }

