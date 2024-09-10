## ５章
### 5.1.6
1,  var java17date = LocalDate.of(2021, 9, 14)

    "%tY年%<tm月%<td日".formatted(java17date)
2,  var java17dateTime = LocalDateTime.of(2021, 9, 14, 14, 30)

    "%tY年%<tm月%<td日%<tH時%<tM分".formatted(java17dateTime)

### 5.1.7
1, jshell> var date = LocalDate.of(2020, 2, 28)
date ==> 2020-02-28

jshell> date.plusDays(1)
$71 ==> 2020-02-29

2, jshell> date.plusWeeks(2)
$72 ==> 2020-03-13
---
1, String.format("%tm月", today)
$74 ==> "08月"

2, String.format("%sは%d", "two" ,2)
$76 ==> "twoは2"

3, "%tY年".formatted(today)
$77 ==> "2024年"

### 5.2.2
1. var b119999 = BigDecimal.valueOf(119999)
   b119999 ==> 119999

jshell> var b01 = BigDecimal.valueOf(0.1)
b01 ==> 0.1

jshell> b119999.multiply(b01)
$80 ==> 11999.9

### 5.2.3
-  p92ここまでしか分からない。代入できない

1.jshell> new BigDecimal("1.4142135623730950488")
$84 ==> 1.4142135623730950488

