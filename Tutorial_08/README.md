# Question 01

Describe the main difference between `Queue` and `PriorityQueue`.

## Solution (Q1)

`Queue` strictly follows the FIFO (First In First Out) order where the first element that gets removed is the first element that gets added first. However, `Priority Queue` does not strictly follow the FIFO order and the element that gets removed first has the highest priority regardless of the order.

# Question 02

Briefly provide **THREE** (3) real-life example in using `PriorityQueue`.

## Solution (Q2)

1. Boarding a flight, the first-class passengers and business class passengers get to board the plane before the economic class passengers.
2. Hospital emergency rooms, the patients with critical conditions should be prioritized and treated before those with less severe illnesses or injuries.
3. To-do lists, the tasks with higher priority or deadlines can be listed at the top to ensure they are completed first.

# Question 3

Show the output for every `System.out.println` (`(a)` – `(f)`) in the following code:

```java
import java.util.*;

public static void main(String args[]) {
    
    PriorityQueue<String> pQueue = new PriorityQueue<String>();
    
    pQueue.offer("C++");
    pQueue.offer("Python");
    pQueue.offer("Java");
    pQueue.offer("Fortran");
    
    System.out.println("peek() gives us: " + pQueue.peek());    // (a)
    System.out.println("The queue elements:");                  // (b)
    
    Iterator itr = pQueue.iterator();
    while (itr.hasNext())
        System.out.println(itr.next());                         // (b)

    pQueue.poll();
    System.out.println("After poll():");                        // (c)
    Iterator<String> itr2 = pQueue.iterator();
    while (itr2.hasNext())
        System.out.println(itr2.next());                        // (c)

    pQueue.remove("Java");
    System.out.println("After remove():");                      // (d)
    Iterator<String> itr3 = pQueue.iterator();
    while (itr3.hasNext())
        System.out.println(itr3.next());                        // (d)

    boolean b = pQueue.contains("Ruby");
    System.out.println("Priority queue contains Ruby or not?: " + b); //(e)
    
    Object[] arr = pQueue.toArray();
    System.out.println("Value in array: ");                     // (f)
    
    for (int i = 0; i<arr.length; i++)
        System.out.println("Value: " + arr[i].toString());      // (f)
}
```

## Solution (Q3)

Part (a):

```
peek() gives us: C++
```

Part (b):

```
The queue elements:
C++
Python
Java
Fortran
```

Part (c)

```
After poll():
Python
Java
Fortran
```

Part (d)

```
After remove():
Python
Fortran
```

Part (e)

```
Priority queue contains Ruby or not?: false
```

Part (f)

```
Value in array: 
Value: Python
Value: Fortran
```

# Question 04

Answer the following sub-questions with referring to the following code:

```java
public class PriorityQueue2 {
    public static void main(String... args ){
        PriorityQueueComparator pqc = new PriorityQueueComparator();
        PriorityQueue<String> pq = new PriorityQueue<String>(5, pqc);
        pq.add("Jason");
        pq.add("Ali");
        pq.add("Muhamad");
        for(String s: pq){ 
            System.out.println(s);
        }
    }
}
public class PriorityQueueComparator implements Comparator<String>{
    public int compare(String s1, String s2) {
        if (s1.length() < s2.length()) {
            return -1;
        }
        if (s1.length() > s2.length()) {
            return 1;
        }
        return 0;
    }
}
```

1. What is the purpose of the `PriorityQueueComparator` in the code?
2. What is the output for the code?

## Solution (Q4)

1. The purpose of `PriorityQueueComparator` is to define a custom ordering method for the elements of the `PriorityQueue`. In this code specifically, it is used to compare two strings based on their length.
2. The output of the code is as below:

    ```
    Ali
    Jason
    Muhamad
    ```