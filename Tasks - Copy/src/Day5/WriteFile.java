package Day5;

import java.io.*;

public class WriteFile {
    public static void main(String[] args) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
        String[] lines = {"Hello", "World", "Java File IO"};
        for (String line : lines) {
            writer.write(line);// writes the current line of the text
            writer.newLine();
        }
        writer.close();
    }
}

