import java.util.Scanner;
import java.io.*;

class Part02 {

    protected static final String FILEPATH = "/workspaces/WIA1002_UM/Lab_01/L1Q1/LimJunYi_22004811.txt";

    public static void main(String[] args) {
        
        String content = Part01.load(FILEPATH);

        try {
            
            PrintWriter fileOut = new PrintWriter(new FileWriter(FILEPATH));
            Scanner sc = new Scanner(System.in);
            content += sc.nextLine();

            fileOut.println("\n" + content);
            fileOut.close();
        }
        catch (FileNotFoundException e) { System.out.println(e); }
        catch (IOException e) { System.out.printf("IOException: %s\n", e); }
    }
}