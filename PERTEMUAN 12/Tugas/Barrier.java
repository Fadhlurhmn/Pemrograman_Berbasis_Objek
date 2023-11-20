package Tugas;

public class Barrier implements Destroyable {
    int strength;

    public Barrier(int strength) {
        this.strength = strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getStrength() {
        return strength;
    }

    public void destroy() {
        this.strength -= (this.strength * 0.02);
    }

    public String getBarrierInfo() {
        return "Barrier Strength = " + this.strength;
    }

    @Override
    public void destroyed() {
        this.strength -= (this.strength * 0.02);
    }
}