# Buổi 3 – Mảng, Hàm, Hằng, Math, và String trong Java

## 1. Mảng trong Java

- Mảng là một tập hợp các phần tử cùng kiểu, lưu trữ liên tiếp trong bộ nhớ.
- Mảng trong Java là **đối tượng**, có **kích thước cố định** và **chỉ số bắt đầu từ 0**.

```java
// Khai báo mảng kiểu int có 5 phần tử
int[] numbers = new int[5];

// Khai báo và khởi tạo mảng
int[] primes = {2, 3, 5, 7, 11};

// Truy cập và thay đổi phần tử
int firstNumber = numbers[0];
primes[2] = 13;

// Duyệt mảng
for (int i = 0; i < primes.length; i++) {
    System.out.println(primes[i]);
}

for (int prime : primes) {
    System.out.println(prime);
}
```

## 2. Hàm và Hằng trong Java

### Hàm
Hàm là khối mã thực hiện một nhiệm vụ cụ thể.

**Ví dụ: Hàm tính giai thừa**
```java
int factorial(int n) {
    if (n == 0 || n == 1) return 1;
    return n * factorial(n - 1);
}

int result = factorial(5); // 120
```

**Ví dụ: Hàm kiểm tra số nguyên tố**
```java
boolean isPrime(int n) {
    if (n <= 1) return false;
    for (int i = 2; i <= Math.sqrt(n); i++) {
        if (n % i == 0) return false;
    }
    return true;
}

boolean primeCheck = isPrime(17); // true
```

**Khác biệt giữa static và non-static**
- **Non-static:** cần tạo đối tượng trước khi gọi.
- **Static:** có thể gọi trực tiếp qua tên lớp.

### Hằng số (`final`)
```java
public class TimeConstants {
    public static final int SECONDS_IN_MINUTE = 60;
    public static final int MINUTES_IN_HOUR = 60;
    public static final int HOURS_IN_DAY = 24;
}

int secondsInADay = TimeConstants.SECONDS_IN_MINUTE 
    * TimeConstants.MINUTES_IN_HOUR 
    * TimeConstants.HOURS_IN_DAY;

System.out.println("Số giây trong một ngày: " + secondsInADay);
```

## 3. Thư viện Math trong Java

```java
double x = 3.0, y = 4.0;

// Căn bậc hai
double squareRoot = Math.sqrt(x);

// Lũy thừa
double power = Math.pow(x, y);

// Giá trị tuyệt đối
double abs = Math.abs(-10.5);

// Làm tròn
double rounded = Math.round(7.85);
double ceil = Math.ceil(7.2);
double floor = Math.floor(7.8);
```

**Hàm lượng giác**
```java
double angle = Math.toRadians(30);
double sin = Math.sin(angle);
double cos = Math.cos(angle);
double tan = Math.tan(angle);

double asin = Math.asin(sin);
double acos = Math.acos(cos);
double atan = Math.atan(tan);
```

**Hàm log và exponential**
```java
double value = 5.0;
double log10 = Math.log10(value);
double ln = Math.log(value);
double exp = Math.exp(value);
```

**Hàm random**
```java
double randomValue = Math.random(); // [0, 1)
```

## 4. Lớp String trong Java

### Tạo và nối chuỗi
```java
String firstName = "John";
String lastName = "Doe";
String fullName = firstName + " " + lastName;
String fullNameConcat = firstName.concat(" ").concat(lastName);
```

### So sánh chuỗi
```java
String str1 = "Hello";
String str2 = "World";
boolean areEqual = str1.equals(str2); // false
boolean ignoreCase = str1.equalsIgnoreCase("HELLO"); // true
```

### Trích xuất và tìm kiếm chuỗi
```java
String sentence = "Java programming is fun and powerful.";
String sub = sentence.substring(5, 15); // "programming"
int index = sentence.indexOf("fun"); // 21
```

### Thay thế và chuyển đổi
```java
String text = "I like apples and apples are tasty.";
String replaced = text.replace("apples", "bananas");
String upper = text.toUpperCase();
String lower = text.toLowerCase();
```

### Kiểm tra chuỗi
```java
String msg = "Hello, Java programming.";
boolean starts = msg.startsWith("Hello"); // true
boolean ends = msg.endsWith("programming."); // false
boolean contains = msg.contains("Java"); // true
```

## 📌 Ghi nhớ

- Mảng: dùng khi biết trước số phần tử và kiểu dữ liệu.
- Hàm: nên viết gọn, rõ ràng, có thể tái sử dụng.
- `final`: tạo ra hằng số không thay đổi.
- `Math`: hỗ trợ đầy đủ các hàm tính toán toán học.
- `String`: lớp quan trọng với nhiều phương thức thao tác chuỗi.
