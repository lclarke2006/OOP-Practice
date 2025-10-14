public class Cleaner extends Employee2 {
    String department;

    public Cleaner(String name, int salary, int age, String Department) {
        super(name, salary, age);
        department = Department;
    }

    public void display() {
        super.display();
        System.out.println(super.Name + " works in department " + department);
    }
}
