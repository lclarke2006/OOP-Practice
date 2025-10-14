public class PlayerDriver {
    public static void main(String[] args) {
        FootballStats football = new FootballStats("Lucas", 18, 55, 16, 45);
        football.printStats();

        System.out.println("\n");

        CricketStats cricket = new CricketStats("Luke", 20, 60, 12, 16);
        cricket.printStats();
    }
}
