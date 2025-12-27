import java.util.*;
public class DeleteStudent {
    public List<String> delete(List<String> records, Scanner sc) {
        System.out.print("Enter Student ID to delete: ");
        int idToDelete = sc.nextInt();

        List<String> updatedRecords = new ArrayList<>();
        boolean found = false;

        for (String line : records) {
            String[] data = line.split(",");
            int id = Integer.parseInt(data[0]);

            if (id == idToDelete) {
                found = true;
                continue; 
            }
            updatedRecords.add(line);
        }

        if (found) {
            System.out.println("Student deleted successfully!");
        } else {
            System.out.println("Student ID not found.");
        }

        return updatedRecords;
    }
}
