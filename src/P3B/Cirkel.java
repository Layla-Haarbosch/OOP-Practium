package P3B;

public class Cirkel {
    private int radius;
    private int xPositie;
    private int yPositie;

    public Cirkel(int rad, int x, int y) {
        if (rad <= 0) {
            // zonder try catch in Main stopt de applicatie tijdens het aanroepen van de constructor
            throw new IllegalArgumentException("Radius moet groter dan 0 zijn!");
        }

        this.radius = rad;
        this.xPositie = x;
        this.yPositie = y;
    }

    @Override
    public String toString() {
        return "Cirkel (" + this.xPositie + ", " + this.yPositie + ") met radius: " + this.radius;
    }
}
