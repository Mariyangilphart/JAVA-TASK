import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CompareFiles {

    public static void main(String[] args) throws IOException {
        // Create two BufferedReader objects to read the input text files line by line.
        BufferedReader reader1 = new BufferedReader(new FileReader("file1.txt"));
        BufferedReader reader2 = new BufferedReader(new FileReader("file2.txt"));

        // Initialize areEqual with true and lineNum with 1.
        boolean areEqual = true;
        int lineNum = 1;

        // Compare the content of the two files line by line.
        while (areEqual && reader1.ready() && reader2.ready()) {
            String line1 = reader1.readLine();
            String line2 = reader2.readLine();

            // If the lines are not equal, set areEqual to false and print the differing lines along with their line numbers.
            if (!line1.equals(line2)) {
                areEqual = false;
                System.out.println("Line " + lineNum + " in file1: " + line1);
                System.out.println("Line " + lineNum + " in file2: " + line2);
            }

            // Increment the line number.
            lineNum++;
        }

        // Close the BufferedReader objects.
        reader1.close();
        reader2.close();

        // If the files are equal, print a message indicating that.
        if (areEqual) {
            System.out.println("The two files are identical.");
        }
    }
}