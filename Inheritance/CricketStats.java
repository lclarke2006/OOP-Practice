public class CricketStats extends PlayerStats {
    int homeRuns;
    int outs;

    public CricketStats(String name, int age, int weight, int HomeRuns, int Outs) {
        super(name, age, weight);
        homeRuns = HomeRuns;
        outs = Outs;
    }

    public void printStats() {
        super.printStats();
        System.out.println("HomeRuns: " + homeRuns);
        System.out.println("Outs: " + outs);
    }
}
