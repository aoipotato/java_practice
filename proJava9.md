## ９章
### 9.1.1
1. package projava;

public class Chapter9 {
public static void main(String[] args) {
for (int i = 0; i < 3; i++) {
System.out.println("Hello");
}
}
}

2. for (int n = 1; n < 11; n++) {
   System.out.println(n);
   }
3. for (int n = 0; n < 10; n++) {
   System.out.println(n);
   }
4. for (int n = 1; n < 11; n++) {
   System.out.println(n);
   }

### 9.1.2
1. for (int i = 0; i < 36; i+=5) {
   System.out.println(i);
2.   for (int i = 20; i > 0; i-=3) {
     System.out.println(i);

### 9.1.5
1. for (int i = 0; i < 10; i++) {
   if (i == 3) {
   System.out.println("skip");
   continue;
   }
   System.out.println(i);
   }
2. if (i == 3 || i == 5) {
   System.out.println("skip");
   continue;
   }
3. if (i >= 3 && i <= 6 ) {
   System.out.println("skip");
   continue;
   }

### 9.2.2
1. for (int i = 1; i <= 9; i++) {
   for (int j = 1; j <= 9; j++) {
   System.out.printf("%2d | ", i * j);
   }
   System.out.println();
   }

1. for (int i = 1; i <= 9; i++) {
   for (int j = 0; j < i; j++) {
   System.out.print("0");
   }
   System.out.println();
   }