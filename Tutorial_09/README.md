# Question 01

Write an adjacency matrix and an adjacency list for the following graph.

![image](./src/image.jpeg)

## Solution (Q1)

Adjacency Matrix:

```
     A  B  C  D  E  F  G  H  I  
  ┌─                           ─┐
A │  0  0  1  1  0  0  0  0  0  │
B │  0  0  0  1  0  0  0  0  0  │
C │  0  0  0  0  1  1  0  0  0  │
D │  0  0  0  0  1  0  0  0  0  │
E │  0  0  0  0  0  0  1  0  0  │
F │  0  0  0  0  0  0  0  1  0  │
G │  0  0  0  0  0  0  0  1  0  │
H │  0  0  0  0  0  0  0  0  1  │
I │  0  0  0  0  0  0  0  0  0  │
  └─                           ─┘
```

Adjacency List

```
    ┌───┬───┐   ┌───┬───┐   ┌───┬───┐
[0] │ A │ ○─┼──>│ C │ ○─┼──>│ D │ / │
    └───┴───┘   └───┴───┘   └───┴───┘
    ┌───┬───┐   ┌───┬───┐
[1] │ B │ ○─┼──>│ D │ / │
    └───┴───┘   └───┴───┘
    ┌───┬───┐   ┌───┬───┐   ┌───┬───┐
[2] │ C │ ○─┼──>│ E │ ○─┼──>│ F │ / │
    └───┴───┘   └───┴───┘   └───┴───┘
    ┌───┬───┐   ┌───┬───┐
[3] │ D │ ○─┼──>│ E │ / │
    └───┴───┘   └───┴───┘
    ┌───┬───┐   ┌───┬───┐
[4] │ E │ ○─┼──>│ G │ / │
    └───┴───┘   └───┴───┘
    ┌───┬───┐   ┌───┬───┐
[5] │ F │ ○─┼──>│ H │ / │
    └───┴───┘   └───┴───┘
    ┌───┬───┐   ┌───┬───┐
[6] │ G │ ○─┼──>│ H │ / │
    └───┴───┘   └───┴───┘
    ┌───┬───┐   ┌───┬───┐
[7] │ H │ ○─┼──>│ I │ / │
    └───┴───┘   └───┴───┘
    ┌───┬───┐
[8] │ I │ / │
    └───┴───┘
```

# Question 02

Represent the graph in question 1 using a 2 dimensional array. You use the adjacency matrix or the adjacency list for this purpose?

## Solution (Q2)

Adjacency Matrix.

```java
int[][] adjacencyMatrix = {
    { 0, 0, 1, 1, 0, 0, 0, 0, 0 },
    { 0, 0, 0, 1, 0, 0, 0, 0, 0 },
    { 0, 0, 0, 0, 1, 1, 0, 0, 0 },
    { 0, 0, 0, 0, 1, 0, 0, 0, 0 },
    { 0, 0, 0, 0, 0, 0, 1, 0, 0 },
    { 0, 0, 0, 0, 0, 0, 0, 1, 0 },
    { 0, 0, 0, 0, 0, 0, 0, 1, 0 },
    { 0, 0, 0, 0, 0, 0, 0, 0, 1 },
    { 0, 0, 0, 0, 0, 0, 0, 0, 0 }
};
```

# Question 03

Write code to create the graph using linked-list representation. You use the adjacency matrix or the adjacency list for this purpose?

## Solution (Q3)

Adjacency List.

```java
String[] vertex = { "A", "B", "C", "D", "E", "F", "G", "H", "I" };

for (String v: vertex) graph.addVertex(v);

graph.addEdge("A", "C", 1);
graph.addEdge("A", "D", 1);
graph.addEdge("B", "D", 1);
graph.addEdge("C", "E", 1);
graph.addEdge("C", "F", 1);
graph.addEdge("D", "E", 1);
graph.addEdge("E", "G", 1);
graph.addEdge("F", "H", 1);
graph.addEdge("G", "H", 1);
graph.addEdge("H", "I", 1);
```