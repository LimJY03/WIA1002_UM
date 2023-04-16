class LabAssessmentMain {

    public static void main(String[] args) {
            
        LATNode<Person> anwarIbrahim = new LATNode<>(new Person("Anwar Ibrahim", 75));
        LATNode<Person> wanAzizah = new LATNode<>(new Person("Wan Azizah", 70));
        LATNode<Person> nurIzzah = new LATNode<>(new Person("Nur Izzah Anwar", 42));
        
        anwarIbrahim.setEdge1("wife", wanAzizah);
        anwarIbrahim.setEdge2("daughter", nurIzzah);
        
        wanAzizah.setEdge1("husband", anwarIbrahim);
        wanAzizah.setEdge2("daughter", nurIzzah);
        
        nurIzzah.setEdge1("father", anwarIbrahim);
        nurIzzah.setEdge2("mother", wanAzizah);

        anwarIbrahim.printEdgesAndNodes();
        wanAzizah.printEdgesAndNodes();
        nurIzzah.printEdgesAndNodes();
    }
}