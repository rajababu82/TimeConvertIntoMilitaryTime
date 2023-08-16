import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ConvertTime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter time in 12-hour format (hh:mm:ss AM/PM): ");
        String inputTime = scanner.nextLine();
        scanner.close();

        SimpleDateFormat inputFormat = new SimpleDateFormat("hh:mm:ss a");
        SimpleDateFormat outputFormat = new SimpleDateFormat("HH:mm:ss");

        try {
            Date date = inputFormat.parse(inputTime);
            String militaryTime = outputFormat.format(date);
            System.out.println("Military time: " + militaryTime);
        } catch (Exception e) {
            System.out.println("Invalid input format. Please use hh:mm:ss AM/PM format.");
        }
    }
}
