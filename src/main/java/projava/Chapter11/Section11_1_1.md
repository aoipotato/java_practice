1.  void hi() { System.out.println("Hi!");}
|  次を作成しました: メソッド hi()

2.  jshell> hi()
Hi!
------

1.  void salutation(String person) { System.out.println("Hello " + "person");}
|  次を変更しました: メソッド salutation(String)


2.  void hellohello(int n) {
...>     for (int i = 0; i < n; i++) {
...>         System.out.print("Hello");
...>     }
...>     System.out.println();
...> }
|  次を作成しました: メソッド hellohello(int)

3.  hellohello(3)
HelloHelloHello
--------------

1.  int db1(int n) { return n * 2;}
    |  次を変更しました: メソッド db1(int)

2.  db1(3)
    $21 ==> 6

3. int triple(int t) {return t * 3;}
   |  次を作成しました: メソッド triple(int)

jshell> triple(10)
$23 ==> 30

4.  String moji(String x) { return x + x;}
    |  次を作成しました: メソッド moji(String)

jshell> moji("api")
$25 ==> "apiapi"

5. int max2(int a, int b) {return a > b ? a : b;}
   |  次を作成しました: メソッド max2(int,int)
6.   int max3 (int c, int d, int e) {return c > d ? (c > e ? c : e) : (d > e ? d : e);}
     |  次を作成しました: メソッド max3(int,int,int)

     max3(2, 22, 3)
     $29 ==> 22



