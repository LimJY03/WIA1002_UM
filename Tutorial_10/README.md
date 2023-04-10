# Question 01

Explain the problem that occurs when executing the recursive method `f(0)`.

```java
public static int f(int n) {
    if (n == 1)
        return n;
    else 
        return n * f(n - 1);
}
```

## Solution (Q1)

The recursive method runs infinitely because the value of `n` will always be lower than the base case of `n == 1`, so it will cause the program's stack to continuously grow until it reaches a particular height and the `StackOverflowError` exception is initiated which crashes the program.

# Question 02

Explain the problem that occurs when executing the recursive method `f()`.

```java
public static int f(int n) {
    if (n == 0)
        return n;
    else 
        return f(n + 1) + n;
}
```

## Solution (Q2)

The problem occurs is the compile-time error. This happens because the method `f()` requires an integer parameter `n` but the function call does not pass in an integer argument. This error happens when the compiler expects the `f()` method call to accept exactly one integer parameter but the argument is not provided.

# Question 03

Write a recursive method to reverse a string: `"String → gnirts"`

## Solution (Q3)

Recursive Method:

```java
public static String reverse(String string, int charPosition) {

    // Base Case
    if (charPosition == string.length() - 1) return "" + string.charAt(charPosition);

    // Recursion
    return reverse(string, charPosition + 1) + string.charAt(charPosition);
}
```

Method Call in `main()`:

```java
String reversedString = reverse("String", 0);
```

# Question 04

Write a recursive method to calculate the following : `5 + 4 + 3 + 2 + 1`. State the base case and recursive case. Trace your solution using number, `N` of 5.

Algorithm :

1. Base case = 1
2. Recursive case = `n` + `sum(n - 1)`

## Solution (Q4)

```java
public static int sum(int n) {

    // Base Case
    if (n == 1) return 1;

    // Recursion
    return n + sum(n - 1);
}
```

# Question 05 

Write a recursive method `printDigit` that prints an integer argument as its constituent digits, with a blank space separates each digit with the next. For example, if the argument is `4567`, this method will print `4 5 6 7` on the screen. 

## Solution (Q5)

```java
public static void printDigit(int n) {

    // Base Case
    if (n == 0) return;

    // Recursion
    int divisor = (int) Math.pow(10, (int) Math.log10(n));
    System.out.printf("%d ", n / divisor);
    printDigit(n % divisor);
}
```