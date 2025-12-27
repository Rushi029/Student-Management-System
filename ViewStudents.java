import java.util.List;
public class ViewStudents {
    public void display(List<String> records) {
        System.out.println("\n--- Student Records ---");
        for (String line : records) {
            String[] data = line.split(",");
            System.out.println("ID: " + data[0] + " | Name: " + data[1] + " | Age: " + data[2]);
        }
    }
}
