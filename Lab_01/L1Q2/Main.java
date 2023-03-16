import java.io.*;

class Main {

    public static void main(String[] args) {
        
        for (int i = 1; i <= 4; i++) {
            
            String filepath = String.format("/workspaces/WIA1002_UM/Lab_01/L1Q2/text%d.txt", i);
            int[] result = countChar(filepath);

            System.out.printf("\nCharacter Count for text%d.txt\n===\n", i);

            // Number
            for (int j = 0; j < 10; j++) {
                if (result[j] == 0) continue;
                System.out.printf("%s: %s\n", j, result[j]);
            }

            // Upper Case
            for (int j = 0; j < 26; j++) {
                if (result[j + 10] == 0) continue;
                System.out.printf("%s: %s\n", (char) ('A' + j), result[j + 10]);
            }

            // Lower Case
            for (int j = 0; j < 26; j++) {
                if (result[j + 36] == 0) continue;
                System.out.printf("%s: %s\n", (char) ('a' + j), result[j + 36]);
            }
        }
    }

    public static int[] countChar(String filepath) {

        int[] result = new int[10 + 26 + 26];
        String line = "";

        // Populate
        for (int n = 0; n < result.length; n++) result[n] = 0;

        // Execute
        try {

            BufferedReader fileIn = new BufferedReader(new FileReader(filepath));

            while ((line = fileIn.readLine()) != null) {

                for (int i = 0; i < line.length(); i++) {

                    char c = line.charAt(i);

                    if (Character.isDigit(c)) result[c - '0']++;
                    else if (Character.isUpperCase(c)) result[c - 'A' + 10]++;
                    else if (Character.isLowerCase(c)) result [c - 'a' + 36]++;
                }
            }

            fileIn.close();
        }
        catch (FileNotFoundException e) { System.out.println(e); }
        catch (IOException e) { System.out.printf("IOException: %s\n", e); }

        return result;
    }
}