# Java examples


## JRE vs JDK
* JRE = JVM + standard class library
* JDK = JRE + Development kit

## 자바 코드 생성과 실행
* Java 생성
* 자바 컴파일러(javac)를 사용하여 자바 바이트 코드 생성
* Class 파일(기계어가 아닌 JVM에서 사용되는 코드)
* java(JVM 런쳐)를 사용하여 class 파일을 실행

### Class, Method naming rule
* 숫자와 특수문자로 시작될 수 없음
* 단, '$'와 '_' 문자 허용
* 한글이름도 사용가능하지만 가급적 한글을 포함하지 않는다

## 변수(Variable)
* 변수는 선언된 블록 내에서만 사용이 가능하다


### 정수 리터럴
* byte
* char
* short
* int
* long

### 실수 리터럴
* float
* double
````java
System.out.println(5E2) // 5 x 10^2
System.out.println(5E3) // 5 x 10^3
````

### 문자 리터럴
```` java
System.out.println('A') // 'A'
System.out.println('\n') // 개행
System.out.println('\\') // '\'
````
* 문자 리터럴을 저장할 수 있는 타입은 char뿐이다

### 문자열 리터럴
````java
System.out.println("Hello World") // "Hello World"
````
* 문자열 리터럴을 저장할 수 있는 타입은 String 타입뿐이다


### 논리 리터럴
* true
* false


## 타입 변환
### 자동(묵시적) 타입 변환
* 작은 크기를 가지는 타입이 큰 크기를 가지는 타입에 저장될때 발생
* 단, char는 2바이트지만 char 범위는 0 ~ 65535이므로 음수를 저장할 수 없다. 따라서 음수가 저장될 수 있는 byte타입을 char 타입으로 자동 변환할 수 없다.

### 강제(명시적) 타입 변환
````java
int a = 65;
char ch = (char)a;
````

## 연산자 우선순위
* 증감(++, --) 부호(+, -) 비트(~), 논리(!)
* 산술(*, /, %)
* 산술(+, -)
* 쉬프트(<<, >>, >>>)
* 비교(<, >, <=, >=, instanceof)
* 비교(==, !=)
* 논리(&)
* 논리(^)
* 논리(|)
* 논리(&&)
* 논리(||)
* 조건(?:)
* 대입(=, +=, -=, *=, /=, %=, &=, ^=, |=, <<=, >>=, >>>=)

#### 정수값을 이진 문자열로 리턴하는 함수
````java
String binString = Integer.toBinaryString(10); // 1010
````

#### 리터럴 타입 연산시 주의
* 리터럴 간의 연산은 타입 변환 없이 해당 타입으로 계산
````java
char c1 = 'A' + 1; 
char c2 = '1';
// char c3 = c2 + 1; // 컴파일 에러
char c3 = (char)(c2 + 1)
````

### Infinity와 NaN(Not a Number)
* 자바에서 Divide 0는 ArithmeticException를 발생시키고 프로그램을 종료하여 개발자에게 알려준다.
* 0.0으로 / or % 을 하는 경우에는 Infinity or NaN가 되는데 이 상태에서는 추가적으로 연산한 값도 같은 결과를 가져오므로 주의가 필요하다.
````java
int x = 5;
double y = 0.0;

double z = x / y; 
// double z = x % y;

System.out.println(Double.isInfinite(z));
System.out.println(Double.isNaN(z));

System.out.println(z + 2);

System.out.println(10/0); // Divide Zero이므로 ArithmeticException 발생!
````

### 비교문

````java
char ch = 'A';
double d = 3.0;
System.out.println(ch == 65) // 65 == 65
System.out.println(3 == 3.0) // 3.0 == 3.0
````
* 문자는 숫자와 비교시 유니코드값으로 비교한다
* int와 double 타입 비교시 double으로 변환되어 비교한다

````java
0.1 == 0.1F // false 
````
* 0.1F 이 double로 변환되어 비교되므로 true가 나올거 같지만 결과값은 false이다. 그 이유는 이진 포맷의 가수를 사용하는 모든 부동소수점 타입은 0.1을 정확히 표현할 수가 없다. 0.1F는 0.1보다 조금 더 큰값이다.
* 위와 같은 상황을 피하려면 float로 캐스팅해서 비교하거나 int로 캐스팅해서 비교하면된다

#### 비트 연산
````java
byte a = 10;
byte b = 12;
byte c = a & b; // compile error
````
* 비트 연산은 int로 변환되므로 연산 결과를 byte타입에 넣을 수 없다

````java
System.out.println(-8 >> 3); // MSB를 유지, -1
System.out.println(-8 >>> 3); // MSB를 무조건 0으로 채움, 536870911
````

### Java 난수
#### 1. Random 클래스
````java
Random random = new Random();
System.out.println(random.nextInt(5)); // 0 ~ 4
````

#### 2. Math 클래스
````java
System.out.println(Math.random() * 5); // 0 ~ 4
````

## 자바 기초 내용과 Java8관련된 예제코드 작성
