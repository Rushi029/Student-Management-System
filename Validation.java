import java.io.*;
public class Validation {
    private static final String FILE_NAME = "studentsRecords.txt";
    // Method to check if ID already exists in file
    public boolean idExists(int id) {
        try (BufferedReader br = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                int existingId = Integer.parseInt(data[0]);
                if (existingId == id) {
                    return true; // ID found
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading file for ID validation.");
        }
        return false; // ID not found
    }
}
