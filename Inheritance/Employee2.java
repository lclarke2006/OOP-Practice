public class Employee2 {
    String Name;
    int Salary;
    int Age;

    public Employee2(String name, int salary, int age) {
        Name = name;
        Salary = salary;
        Age = age;
    }

    public void display() {
        System.out.println("Name: " + Name + ", Age: " + Age + ", Salary: " + Salary);
    }
}
