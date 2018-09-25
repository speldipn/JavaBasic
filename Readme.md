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




## 자바 기초 내용과 Java8관련된 예제코드 작성
