public class FootballStats extends PlayerStats{
    int goals;
    int shotSpeed;

    public FootballStats(String name, int age, int weight,int Goals, int ShotSpeed) {
        super(name, age, weight);
        goals = Goals;
        shotSpeed = ShotSpeed;
    }

    public void printStats() {
        super.printStats();
        System.out.println("Goals: " + goals);
        System.out.println("Shot Speed: " + shotSpeed);
    }
}
