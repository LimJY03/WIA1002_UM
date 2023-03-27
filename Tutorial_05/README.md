# Question 01

```java
public E xyz(int index, E e) {
    Node<E> current=head;
    Node<E> temp;
    if(index<0) return null;
    else if(index>=size-1) {
        this.addLast(e);
        return null;
    }
    else if(index==0) {                     // Line 10
        temp=head;
        head.element=e;
        return temp.element;
    } else {
        for (int i = 1; i < index; i++) {
            current=current.next;
        }
        temp=current.next;
        current.next.element=e;
        return temp.element;
    }                                       // Line 21
}
```

Given method `xyz` with 2 arguments:

1. Based on the above source code, explain what the lines of code do from line 10 – 21.
2. What is the main purpose of the method `xyz()`?
3. Obviously, there are some bugs in the source code. Debug the code and make it concise and simpler.

## Solution (Q1)

Line 10 to Line 21 adds the element `e` of generic type `E` into the linked list at the index of `index`. Line 10 to 14 adds `e` to the first index of the linked list, whereas line 14 to line 21 adds `e` to any index position in the linked list.

The main purpose of `xyz()` is to insert a node of element `e` into the index `index` of the linked list.

```java
public void xyz(int index, E e) {

    if(index < 0) return new IndexOutOfBoundException();
    if(index >= size - 1) return this.addLast(e);

    Node<E> current = head;
    Node<E> temp = new Node<>(e);

    if(index == 0) {
        temp.next = head;
        head = temp;
    } 
    else {
        for (int i = 0; i < index - 1; i++) current = current.next; // Traverse nodes
        temp.next = current.next;
        current.next = temp;
    }
}
```

# Question 02

```java
else{                           // Line 01
    Node<E> temp = head;        // Line 02
    for(int i=0; i<index; i++){ // Line 03
        temp = temp.next;       // Line 04
    }                           // Line 05
    element = temp.element;     // Line 06
    temp.next.prev = temp.prev; // Line 07
    temp.prev.next = temp.next; // Line 08
    temp.next = null;           // Line 09
    temp.prev = null;           // Line 10
    size --;                    // Line 11
}                               // Line 12
```

Based on the source code above, assume the `index` given is 3

1. Explain what the lines of code do from line 2-11.
2. Draw the nodes for lines 7 - 10

## Solution (Q2)

At line 2, we copy the `head` to the `temp` node, at line 3 to line 5 we traverse the node to the index `index`, at line 6 we copy the element in the node of index `index` to `element`, then at line 7 to line 10 we link the previous node and next node of the node of index `index` together and then disconnect the node at index `index` to both nodes. Then finally at line 11 we reduce the `size` property of our doubly linked list after the removal of the node.

Node condition at Line 7 and 8:

```
              ┌─────────────────────┐
head:         V       index:        │       tail:
┌──────┐   ┌──────┐   ┌──────┐   ┌──────┐   ┌──────┐
│ prev │<──│ prev │<──│ prev │<──│ prev │<──│ prev │
├──────┤   ├──────┤   ├──────┤   ├──────┤   ├──────┤
│ el 0 │...│ el 1 │   │ el 2 │   │ el 3 │...│ el 4 │
├──────┤   ├──────┤   ├──────┤   ├──────┤   ├──────┤
│ next │──>│ next │──>│ next │──>│ next │──>│ next │
└──────┘   └──────┘   └──────┘   └──────┘   └──────┘
              │                     A
              └─────────────────────┘
```

Node condition at Line 9 and 10:

```
              ┌─────────────────────┐
head:         V       index:        │       tail:
┌──────┐   ┌──────┐   ┌──────┐   ┌──────┐   ┌──────┐
│ prev │<──│ prev │   │ prev │   │ prev │<──│ prev │
├──────┤   ├──────┤   ├──────┤   ├──────┤   ├──────┤
│ el 0 │...│ el 1 │   │ el 2 │   │ el 3 │...│ el 4 │
├──────┤   ├──────┤   ├──────┤   ├──────┤   ├──────┤
│ next │──>│ next │   │ next │   │ next │──>│ next │
└──────┘   └──────┘   └──────┘   └──────┘   └──────┘
              │                     A
              └─────────────────────┘
```

Post condition:

```
head:                            tail:
┌──────┐   ┌──────┐   ┌──────┐   ┌──────┐
│ prev │<──│ prev │<──│ prev │<──│ prev │
├──────┤   ├──────┤   ├──────┤   ├──────┤
│ el 0 │...│ el 1 │   │ el 3 │...│ el 4 │
├──────┤   ├──────┤   ├──────┤   ├──────┤
│ next │──>│ next │──>│ next │──>│ next │
└──────┘   └──────┘   └──────┘   └──────┘
```

# Question 3

A doubly linked list keeps a set of characters. The head, the middle and the tail nodes respectively
contains alphabet `‘a’`, `‘b’` and `‘c’`. These nodes are in successive order. Create a new node that contains
alphabet `‘z’`. Add this new node at the last location of this linked list. Draw all of these nodes including
their correct references.

## Solution (Q3)

```
head:      mid:                  tail:
┌──────┐   ┌──────┐   ┌──────┐   ┌──────┐
│ prev │<──│ prev │<──│ prev │<──│ prev │
├──────┤   ├──────┤   ├──────┤   ├──────┤
│ 'a'  │   │ 'b'  │   │ 'c'  │   │ 'z'  │
├──────┤   ├──────┤   ├──────┤   ├──────┤
│ next │──>│ next │──>│ next │──>│ next │
└──────┘   └──────┘   └──────┘   └──────┘
```