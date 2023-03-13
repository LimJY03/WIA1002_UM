import java.io.*;

protected class Part01 {

    public static void main(String[] args) {

        System.out.println(load("./LimJunYi_22004811.txt"));        
    }

    protected static String load(String filepath) {
        
        BufferedReader fileIn = new BufferedReader(new FileReader(filepath));
        String line = "";

        try {
            // while ((line = fileIn.readLine()) != null) { System.out.printf("%s\n", line); }
            while (true) {
                try { line += fileIn.readline(); } catch (EOFException e) {}
            }
        }
        catch (FileNotFoundException e) { System.out.println(e); }
        catch (IOException e) { System.out.printf("IOException: %s\n", e); }

        fileIn.close();

        return line;
    }
}