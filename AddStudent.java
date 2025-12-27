import java.util.Scanner;
public class AddStudent {
    public String getStudentRecord(Scanner sc) {
        System.out.print("Enter ID: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Age: ");
        int age = sc.nextInt();

        return id + "," + name + "," + age;
    }
}

