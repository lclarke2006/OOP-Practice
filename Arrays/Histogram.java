import java.util.Scanner;

public class Histogram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int one = 0;
        int two = 0;
        int three = 0;
        int four = 0;
        int five = 0;
        int six = 0;
        int seven = 0;
        int eight = 0;
        int nine = 0;
        int ten = 0;

        boolean running = true;

        while (running) {

            System.out.println("Enter a number: ");
            int number = sc.nextInt();

            if (number < 0 && number >= 10) {
                one += 1;
            }

            if (number < 10 && number >= 20) {
                two += 1;
            }

            if (number < 20 && number >= 30) {
                three += 1;
            }

            if (number < 30 && number >= 40) {
                four += 1;
            }

            if (number < 40 && number >= 50) {
                five += 1;
            }

            if (number < 50 && number >= 60) {
                six += 1;
            }

            if (number < 60 && number >= 70) {
                seven += 1;
            }

            if (number < 70 && number >= 80) {
                eight += 1;
            }

            if (number < 80 && number >= 90) {
                nine += 1;
            }

            if (number < 90 && number >= 100) {
                ten += 1;
            }

            if (number == 404) {
                running = false;
            }

        }

        for (int i = 0; i < 10; i++) {
            int low = (i * 10) + 1;
            int high = (i + 1) * 10;

            System.out.println(low + "-" + high + ":");

            for (int j = 0; j < one; j++) {
                System.out.println("*");
            }

            for (int j = 0; j < two; j++) {
                System.out.println("*");
            }

            for (int j = 0; j < three; j++) {
                System.out.println("*");
            }

            for (int j = 0; j < four; j++) {
                System.out.println("*");
            }

            for (int j = 0; j < five; j++) {
                System.out.println("*");
            }

            for (int j = 0; j < six; j++) {
                System.out.println("*");
            }

            for (int j = 0; j < seven; j++) {
                System.out.println("*");
            }

            for (int j = 0; j < eight; j++) {
                System.out.println("*");
            }

            for (int j = 0; j < nine; j++) {
                System.out.println("*");
            }

            for (int j = 0; j < ten; j++) {
                System.out.println("*");
            }
        }
    }
}
