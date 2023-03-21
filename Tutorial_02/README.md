# Question 01

Create a generic class called `Container` that accepts one parameter, `T`. Create a no-arg constructor. Declare a private variable, `t` of type `T`. Create a method, `add` that returns nothing, accepting a parameter of generic type. Initialize this parameter to the initially declared variable. Create a generic method called `retrieve()` that returns the initially declared variable. 

Create a main method within the `Container` class. Create two containers of type Integer and String. Append two objects to the containers, one of type Integer having value 50, another of type String having value Java. Display the Integer and String objects from the respective containers. 

## Solution (Q1)

```java
class Container<T> {

    private T t;

    // Constructor
    public Container() {}

    // Methods
    public void add(T t) { this.t = t; }
    public T retrieve() { return this.t; }

    // Main
    public static void main(String[] args) {

        Container<Integer> c1 = new Container<>();
        Container<String> c2 = new Container<>();

        c1.add(50);
        c2.add("Java");

        System.out.println(c1.retrieve());
        System.out.println(c2.retrieve());
    }
}
```

# Question 02

Create a class called MyArray that has two methods, a main method that creates 3 arrays of:

1. integer containing the numbers 1,2,3,4 and 5
2. string containing names, Jane, Tom and Bob
3. character containing alphabet, a, b and c

and a generic method `listAll` that displays the list of arrays.

## Solution (Q2)

```java
class MyArray {

    // Methods
    public static <E> void listAll(E[] list) {
        for (E elem: list) { System.out.printf("%s ", elem); }
        System.out.println();
    }

    // Main
    public static void main(String[] args) {

        Integer[] numbers = {1, 2, 3, 4, 5};
        String[] names = {"Jane", "Tom", "Bob"};
        Character[] letters = {'a', 'b', 'c'};

        MyArray.<Integer>listAll(numbers);        
        MyArray.<String>listAll(names);
        MyArray.<Character>listAll(letters);
    }
}
```

# Question 03

What is a raw type? Why is a raw type unsafe? Why is the raw type allowed in Java?

## Solution (Q3)

A raw type is the use of a generic class or interface without specifying a type parameter. 

Raw type is unsafe because it allows input of datatypes different than intended which may ultimately cause type safety issues.

Before Java 5, collections and other classes that worked with groups of objects did not use generics. When generics were introduced, the raw types allowed developers to use these older classes without updating them to use generics.

# Question 04

What is erasure? Why are Java generics implements using erasure?

## Solution (Q4)

Erasure is the approach where the compiler uses the generic type information to compile the code, but erases 
it afterwards, so the generic information is not available at run time.

This approach enables the generic code to be backward-compatible with the legacy code that uses raw types.

# Question 05

Create a generic class named `Duo` that has two parameters, `A` and `B`. Declare a variable named `first` of type `A`, and the second variable named `second` of type `B`. Create a constructor that accepts these two parameters. In the constructor, assign these parameters respectively to the declared variables. 

## Solution (Q5)

```java
class Duo<A, B> {

    A first;
    B second;

    // Constructor
    public Duo(A first, B second) {
        this.first = first;
        this.second = second;
    }
}
```

# Question 06

Use the `Duo` class in Question 5 to declare and create two objects as follows:

1. First object called `sideShape` consist of respectively String type and Integer type.
2. Second object called `points` consists of two Double types. 

## Solution (Q6)

```java
class Main {
    public static void main(String[] args) {
        Duo<String, Integer> sideShape = new Duo<>("", 0);
        Duo<Double, Double> points = new Duo<>(0.0, 0.0);
    }
}
```

# Question 07

Assume that the following objects were created:

```java
ArrayList<String> vehicle = new ArrayList<>();
ArrayList<Object> transportation = new ArrayList<>();
```

Declare a method header for generic method, `allTransportation` that returns nothing, which accepts two `ArrayList` parameters using the wildcards.

## Solution (Q7)

```java
public void allTransportation(ArrayList<?> arr1, ArrayList<?> arr2)
```

# Question 08

Assuming that two new object are created as follows:

```java
ArrayList<Integer> numOfCars = new ArrayList<>();
ArrayList<Double> milesPerHour = new ArrayList<>();
```

Using the `<?>` wildcard, implement a generic method that displays the list.

## Solution (Q8)

```java
public void display(ArrayList<?> arr) {
    for (int i = 0; i < arr.size(); i++) { System.out.printf("%s ", arr.get(i)); }
    System.out.println();
}
```
 
# Queestion 09

When the compiler encounters a generic class, interface, or method with an unbound type parameter, such as `<T>` or `<E>`, it replaces all occurrences of the type parameter with what type?

## Solution (Q9)

Object type.

# Question 10

When the compiler encounters a generic class, interface, or method with a bound type parameter, such as `<T extends Number>` or `<E extends Comparable>`, it replaces all occurrences of the type parameter with what type?

## Solution (Q10)

The bounded type.
