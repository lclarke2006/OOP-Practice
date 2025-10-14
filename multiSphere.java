public class multiSphere {
    public static void main(String[] args) {
        Spheres one = new Spheres(5);
        Spheres two = new Spheres(10);

        one.calculateVolume();
        two.calculateVolume();

        one.calculateSa();
        two.calculateSa();

        System.out.println(one.toString());
        System.out.println(two.toString());
    }
}
