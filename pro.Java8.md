## 8章
### 8.1.1
1. import java.time.LocalDate

jshell> var day1 = LocalDate.of(2021, 9, 14)
day1 ==> 2021-09-14

jshell> var day2 = LocalDate.of(2021, 3, 15)
day2 ==> 2021-03-15

jshell> var daylist = List.of(day1, day2)
daylist ==> [2021-09-14, 2021-03-15]

2. daylist.get(1)
$5 ==> 2021-03-15

### 8.1.2
1. jshell> var authers = new ArrayList<String>()
authers ==> []

jshell> authers.add("hosoya")
$8 ==> true

jshell> authers
authers ==> [hosoya]

2. jshell> authers.set(1, "kishida")
$17 ==> "yamada"

jshell> authers
authers ==> [hosoya, kishida, tanaka]

3.  var datas = new ArrayList<String>()
datas ==> []

4. datas.add("2021年9月14日")
$35 ==> "day1"

jshell> datas
datas ==> [2021年9月14日]

### 8.2.3
1.  var num = new int[5]
num ==> int[5] { 0, 0, 0, 0, 0 }

2.  num[2] = 2
$41 ==> 2

jshell> num
num ==> int[5] { 0, 0, 2, 0, 0 }

3. scores = new int[]{2, 3, 5, 7}
scores ==> int[4] { 2, 3, 5, 7 }

4. scores[3]
$44 ==> 7

### 8.3.3
1. record Word(String english, String japanese){}
|  次を作成しました: レコード Word

2. var lang = new Word("apple", "りんご")
lang ==> Word[english=apple, japanese=りんご]

3. record Spending(LocalDate date, int price, String memo){}
|  次を作成しました: レコード Spending

4. import java.time.LocalDate
jshell> record Spending(LocalDate date, int price, String memo){}
|  次を変更しました: レコード Spending

var spen = new Spending(LocalDate.of(2024, 3, 4), 150, "drink")
spen ==> Spending[date=2024-03-04, price=150, memo=drink]

### 8.4.2
1. animals.get("dog")
$61 ==> "いぬ"

2. animals.put("horse", "うま")
$62 ==> null

animals
animals ==> {horse=うま, cat=猫, dog=いぬ, fox=きつね}

3.  animals.size()
    $64 ==> 4

