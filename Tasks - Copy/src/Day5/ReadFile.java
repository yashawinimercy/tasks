package Day5;

import java.io.*;

public class ReadFile {
    public static void main(String[] args) throws IOException {//not Handel inside the method 
        BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
        String line;
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }
        reader.close();
    }
}
