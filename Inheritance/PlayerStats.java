public class PlayerStats {
    String name;
    int age;
    int weight;

    public PlayerStats(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public void printStats() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Weight: " + weight);
    }
}
