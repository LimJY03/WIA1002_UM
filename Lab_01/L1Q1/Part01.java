import java.io.*;

class Part01 {

    public static void main(String[] args) {

        // System.out.println(load("./LimJunYi_22004811.txt"));        
        System.out.println(load("/workspaces/WIA1002_UM/Lab_01/LimJunYi_22004811.txt"));        
    }

    public static String load(String filepath) {
        
        String line = "", nextLine = "", result = "";
        
        try {

            BufferedReader fileIn = new BufferedReader(new FileReader(filepath));
            
            line = fileIn.readLine();
            while (true) {

                nextLine = fileIn.readLine();

                if ((line == null) && (nextLine == null)) break;

                result += line + "\n";
                line = nextLine;
            }
            fileIn.close();
        }
        catch (FileNotFoundException e) { System.out.println(e); }
        catch (IOException e) { System.out.printf("IOException: %s\n", e); }

        return result;
    }
}