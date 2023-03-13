package ReadMyLetter_22004811;

import java.io.*;

public class L1Q1 {

    public static void main(String[] args) {

        BufferedReader fileIn = new BufferedReader(new FileReader("./LimJunYi_22004811.txt"));
        String line = "";

        try {
            // while ((line = fileIn.readLine()) != null) { System.out.printf("%s\n", line); }
            while (true) {
                try { line = fileIn.readline(); } catch (EOFException e) {}
                System.out.println(line);
            }
        }
        catch (FileNotFoundException e) { System.out.printf("%s\n" + e); }
        catch (IOException e) { System.out.printf("IOException: %s\n" + e); }

        fileIn.close();
    }
}