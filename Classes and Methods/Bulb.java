public class Bulb {
    boolean on;

    public Bulb(boolean on) {
        this.on = on;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    @Override
    public String toString() {
        return "Bulb{" +
                "on=" + on +
                '}';
    }
}
