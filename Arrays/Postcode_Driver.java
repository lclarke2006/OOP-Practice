import java.util.ArrayList;
import java.util.Scanner;

public class Postcode_Driver {
    public static void main(String[] args) {

        ArrayList<Postcode> postcodes = new ArrayList<Postcode>(25);

        Scanner sc = new Scanner(System.in);

        boolean running = true;

        while (running) {
            System.out.print("Enter details: ");
            String details = sc.nextLine();

            if (details.equals("exit")) {
                running = false;
            }

            else {
                String[] split = details.split("\t");

                if (split.length == 3) {
                    Postcode postcode = new Postcode(split[0], split[1], split[2]);
                    postcodes.add(postcode);
                }

                else {
                    System.out.println("Invalid details");
                }
            }
        }

        for (Postcode postcode : postcodes) {
            System.out.println(postcode);
        }
    }
}
