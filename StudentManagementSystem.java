import java.io.*;
import java.util.*;
public class StudentManagementSystem {
    private static final String FILE_NAME = "studentsRecords.txt";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        AddStudent addObj = new AddStudent();
        ViewStudents viewObj = new ViewStudents();
        UpdateStudent updateObj = new UpdateStudent();
        DeleteStudent deleteObj = new DeleteStudent();

        do {
            System.out.println("\n***** Student Management System *****");
            System.out.println("1. Add NewStudent");
            System.out.println("2. View All Students");
            System.out.println("3. Update Student Details");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1 -> {
                    String record = addObj.getStudentRecord(sc);
                    writeRecord(record);
                }
                case 2 -> {
                    List<String> records = readRecords();
                    viewObj.display(records);
                }
                case 3 -> {
                    List<String> records = readRecords();
                    List<String> updatedRecords = updateObj.update(records, sc);
                    writeAllRecords(updatedRecords);
                }
                case 4 -> {
                    List<String> records = readRecords();
                    List<String> updatedRecords = deleteObj.delete(records, sc);
                    writeAllRecords(updatedRecords);
                }
                case 5 -> System.out.println("Exiting program...");
                default -> System.out.println("Invalid choice! Try again.");
            }
        } while (choice != 5);

        sc.close();
    }

    // Helper: Write single record
    private static void writeRecord(String record) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILE_NAME, true))) {
            bw.write(record);
            bw.newLine();
            System.out.println("Student added successfully!");
        } catch (IOException e) {
            System.out.println("Error writing to file.");
        }
    }
    // Helper: Read all records
    private static List<String> readRecords() {
        List<String> records = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            while ((line = br.readLine()) != null) {
                records.add(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading file.");
        }
        return records;
    }

    // Helper: Rewrite all records (used for update/delete)
    private static void writeAllRecords(List<String> records) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILE_NAME))) {
            for (String record : records) {
                bw.write(record);
                bw.newLine();
            }
            System.out.println("File updated successfully!");
        } catch (IOException e) {
            System.out.println("Error writing file.");
        }
    }
}
