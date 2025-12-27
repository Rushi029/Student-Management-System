import java.util.List;
public class ViewStudents {
    public void display(List<String> records) {
        System.out.println("\n--- Student Records ---");

        if (records == null || records.isEmpty()) {
            System.out.println("No Records found.");
            return;
        }

        for (String line : records) {
            String[] data = line.split(",");
            if (data.length == 3) {
                System.out.println("ID: " + data[0] + " | Name: " + data[1] + " | Age: " + data[2]);
            }
        }
    }
}

