# Question 01

Name four everyday examples of a queue other than those discussed during lecture.

## Solution (Q1)

1. Traffic on a highway
2. Movie theater ticket lines
3. Printing document queue
4. Airplane boarding

# Question 02

What is the difference between a queue and stack? 

## Solution (Q2)

Queue implements the FIFO (First In First Out) order where the element that gets removed first is the first element that enters the queue.

Stack however implements the LIFO (Last In First Out) order where the element that gets removed first is the last element that just entered the stack.

# Question 03

Use the following code segment to answer parts (1) through (3):

```java
Queue<Integer> q = new Queue<Integer>();
Scanner keyIn = new Scanner(System.in);
for (int i = 1; i <= 5; i++) {
    if (keyIn.nextBoolean())
        System.out.print(i + " ");
    else
        q.enqueue(i);
}
while (!q.isEmpty())
    System.out.print(q.dequeue() + " ");

System.out.println();
```

1. What is the output for the following input sequence? 

    ```java
    true false false true true
    ```

2. Is it possible to have output: `1 3 5 4 2`? If yes, give an input sequence that produces the output; or else, provide justification to your answer.

3. Give at least three input sequences that produce the output: `1 2 3 4 5`

## Solution (Q3)

Part 1:

```
1 4 5 2 3
```

Part 2:

Impossible. The code above can only produce two sub-lists of increasing values, where the first sub-list is generated with `true` input and the second sub-list is dequeued for `false` input, but for `1 3 5 4 2` there are 3 sub-lists of increasing value, i.e. `1 3 5`, `4` and `2`.

Part 3:

```java
// Input 1
true true true true true

// Input 2
false false false false false

// Input 3
true true true true false
```

# Question 04

```java
X.enqueue(new Integer(14));
X.enqueue(new Integer(3));
X.enqueue(new Integer(5));

Object Y = X.dequeue();

X.enqueue(new Integer(7));
X.enqueue(new Integer(9));

Y = X.dequeue();

X.enqueue(new Integer(2));
X.enqueue(new Integer(4));
```

Given the resulting queue `X` above, what would be the result of each of the following?

```java
// (1)
X.front();

// (2)
Y = X.dequeue();
X.enqueue(new Integer(10));
X.front();

// (3)
Y = X.dequeue();

// (4)
X.front();
```

## Solution (Q4)

1. `5`
2. `7`
3. `Y = 7`
4. `9`

# Question 05

Provide and explain three operations / functions of `LinkedList`-based `Queue` that you can add to the `GenericQueue` class, other than those discussed in the lecture (i.e., `enqueue`, `dequeue` and `getSize` – from Slide 10 in the lecture slide).

## Solution (Q5)

The first operation that can be added is the `peek()` method, where it returns the first element in the queue without actually removing it.

The second operation that can be added is the `isEmpty()` method, where it returns a boolean value to check if the queue is empty.

The third operation that can be added is the `clear()` method, where it clears the queue by setting the head and the tail pointer towards `null`.