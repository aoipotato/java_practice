package projava.Chapter14;

interface Named {
    String name();
}

record Staff(String name, String job) implements Named {}


