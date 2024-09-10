## 7章
### 7.1
1, "test".contains("st")
$87 ==> true

### 7.1.1
12 < 35
$88 ==> true

jshell> 12 <= 35
$89 ==> true

jshell> 12 == 35
$90 ==> false

jshell> 12 != 35
$91 ==> true

### 7.1.2
1,  "test".compareTo("TEST")
$92 ==> 32

2,var today = LocalDate.now()
   today ==> 2024-08-05

jshell> var past = LocalDate.of(2022, 3, 15)
past ==> 2022-03-15

jshell> today.compareTo(past)
$95 ==> 2
(1じゃないのか？)

3, today.isBefore(past)
$101 ==> false

### 7.1.3
1, "hello".toUpperCase()
$102 ==> "HELLO"

2, var java17 = LocalDate.of(2021, 9, 14)
java17 ==> 2021-09-14

jshell> java17.plusDays(10).equals(LocalDate.of(2021, 9, 24))
$104 ==> true

<次からChapter.java7ファイル>