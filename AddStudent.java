import java.util.Scanner;
public class AddStudent {
    private Validation validator = new Validation();
    public String getStudentRecord(Scanner sc) {
        int id = 0;
        int age = 0;
        String name = "";

        //Validate ID (integer only)
        while (true) {
            System.out.print("Enter ID : ");
            if (sc.hasNextInt()) {
                id = sc.nextInt();
                sc.nextLine();
                break;
            } else {
                System.out.println("Invalid input! ID must be an integer value only.");
                sc.nextLine(); 
            }
        }

        // Check duplicate ID
        if (validator.idExists(id)) {
            System.out.println("Student with ID " + id + " already exists.");
            return null;
        }

        //Validate Name (string only, not empty, not numeric)
        while (true) {
            System.out.print("Enter  Student Name: ");
            name = sc.nextLine().trim();
            if (!name.isEmpty() && !name.matches("\\d+")) {
                break;
            } else {
                System.out.println("Invalid input. Name must be a non-empty string.");
            }
        }

        //Validate Age (integer only)
        while (true) {
            System.out.print("Enter Age : ");
            if (sc.hasNextInt()) {
                age = sc.nextInt();
                sc.nextLine(); // consume newline
                break;
            } else {
                System.out.println("Invalid input. Age must be an integer.");
                sc.nextLine(); 
            }
        }

        return id + "," + name + "," + age;
    }
}
