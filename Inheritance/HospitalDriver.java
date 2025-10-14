public class HospitalDriver {
    public static void main(String[] args) {
        Doctor doctor = new Doctor("Lucas", 40000, 18, 12);
        doctor.display();

        System.out.println("\n");

        Cleaner cleaner = new Cleaner("Luke", 15000, 20, "17B");
        cleaner.display();
    }
}
