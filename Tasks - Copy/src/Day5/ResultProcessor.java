package Day5;
import java.io.*;

public class ResultProcessor {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("marks.txt"));
        BufferedWriter writer = new BufferedWriter(new FileWriter("results.txt"));
        String line;

        while ((line = reader.readLine()) != null) {
            String[] parts = line.split(",");
            String name = parts[0];
            int total = 0;//stores the total mark of students

            for (int i = 1; i < parts.length; i++) {
                total += Integer.parseInt(parts[i]);
            }

            double avg = total / (parts.length - 1.0);
            writer.write(name + " - Total: " + total + ", Average: " + avg);
            writer.newLine();
        }

        reader.close();
        writer.close();
    }
}
