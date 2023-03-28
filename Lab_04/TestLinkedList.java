public class TestLinkedList {
    
    public static void main(String[] args) {
        
        MyLinkedList<Character> ll = new MyLinkedList<>();
        
        // Append the following : a, b, c, d, e
        ll.addFirst('a');
        ll.add(1, 'b');
        ll.add(2, 'c');
        ll.add(3, 'd');
        ll.addLast('e');

        // Print all the elements in the list
        ll.print();

        // Reverse all the elements in the list. 
        ll.reverse();

        // Retrieve the number of elements in the list.
        ll.indexOf(ll.getLast());

        // Retrieve the first and last value.
        System.out.printf("First Element: %s\n", ll.getFirst());
        System.out.printf("Last Element: %s\n", ll.getLast());

        // Delete the third value.
        System.out.println(ll.remove(2)); 

        // Retrieve the index location for the second and third value. 
        System.out.printf("Index Location for b: %s\n", ll.indexOf('b'));
        System.out.printf("Index Location for c: %s\n", ll.indexOf('c'));

        // Checks if the list has the value ‘c’.
        System.out.printf("The list contains 'c'? %s\n", ll.contains('c'));

        // Replace the items individually with the following: j,a,v,a.
        ll.set(0, 'j');
        ll.set(1, 'a');
        ll.set(2, 'v');
        ll.set(3, 'a');
        ll.print();
    }
}