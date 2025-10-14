public class Doctor extends Employee2 {
    int patients;

    public Doctor(String name, int salary, int age, int Patients) {
        super(name, salary, age);
        patients = Patients;
    }

    public void display() {
        super.display();
        System.out.println(super.Name + " has " + patients + " patients");
    }
}
