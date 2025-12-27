import java.util.*;
public class UpdateStudent {
    public List<String> update(List<String> records, Scanner sc) {
        System.out.print("Enter Student ID to update: ");
        int idToUpdate = sc.nextInt();
        sc.nextLine();

        List<String> updatedRecords = new ArrayList<>();
        boolean found = false;

        for (String line : records) {
            String[] data = line.split(",");
            int id = Integer.parseInt(data[0]);

            if (id == idToUpdate) {
                System.out.print("Enter Updated Name: ");
                String newName = sc.nextLine();
                System.out.print("Enter Updated Age: ");
                int newAge = sc.nextInt();
                sc.nextLine();

                updatedRecords.add(id + "," + newName + "," + newAge);
                found = true;
            } else {
                updatedRecords.add(line);
            }
        }

        if (found) {
            System.out.println("Student updated successfully!");
        } else {
            System.out.println("Student ID not found.");
        }

        return updatedRecords;
    }
}
