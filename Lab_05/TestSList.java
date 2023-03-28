public class TestSList {

    public static void main(String[] args) {
        
        SList<String> sl = new SList<>();

        // Append the following values individually: “Linked list, is, easy.”
        sl.appendEnd("Linked list");
        sl.appendEnd("is");
        sl.appendEnd("easy");

        // Display these values. 
        sl.display();

        // Remove the word “Linked list” and display the removed value.
        sl.removeInitial();

        // Check if ‘difficult’ is in the list.
        System.out.println(sl.contains("difficult"));

        // Clear the list.
        sl.clear();
        sl.display();
    }
}