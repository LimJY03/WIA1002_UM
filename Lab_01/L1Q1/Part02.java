import java.util.Scanner;
import java.io.*;

protected class Part02 {

    protected static final String FILEPATH = "LimJunYi_22004811.txt";

    public static void main(String[] args) {
        
        PrintWriter fileOut = new PrintWriter(new FileWriter(FILEPATH));
        Scanner sc = new Scanner(System.in);
        String content = Part01.load(FILEPATH) + sc.nextLine();

        try { fileOut.println(content); }
        catch (FileNotFoundException e) { System.out.println(e); }
        catch (IOException e) { System.out.printf("IOException: %s\n", e); }

        fileOut.close();
    }
}