public class Lights {
    public static void main(String[] args) {
        Bulb one = new Bulb(false);
        Bulb two = new Bulb(false);
        Bulb three = new Bulb(false);
        Bulb four = new Bulb(false);
        Bulb five = new Bulb(false);

        one.setOn(true);
        two.setOn(true);
        three.setOn(true);
        four.setOn(true);
        five.setOn(true);

        System.out.println(one.toString());
        System.out.println(two.toString());
        System.out.println(three.toString());
        System.out.println(four.toString());
        System.out.println(five.toString());
    }
}
