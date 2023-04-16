public class LabAssessmentTest {

    public static void main(String[] args) {

        LATNode<String> alice = new LATNode<>("Alice");
        LATNode<String> bob = new LATNode<>("Bob");
        LATNode<String> you = new LATNode<>("You");
        LATNode<String> dave = new LATNode<>("Dave");
        LATNode<String> elsa = new LATNode<>("Elsa");
        LATNode<String> frank = new LATNode<>("Frank");

        alice.setEdge1("friend", you);
        you.setEdge1("friend", alice);
        alice.setEdge2("husband", bob);
        bob.setEdge1("wife", alice);
        bob.setEdge2("father", frank);
        frank.setEdge1("son", bob);
        frank.setEdge2("wife", elsa);
        elsa.setEdge1("husband", frank);
        elsa.setEdge2("boss", dave);
        dave.setEdge1("subordinate", elsa);
        
        // find the killer
        System.out.println(
            String.format("Killer is %s!",
                dave.traverse("subordinate")
                    .traverse("husband")
                    .traverse("son")
                    .traverse("wife")
                    .traverse("friend")
                    .getValue()
            )
        );
    }
}
