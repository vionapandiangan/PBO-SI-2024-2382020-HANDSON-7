package Polimorfisme;

public class Lingkaran extends BangunDatar{
    private double radius;

    public Lingkaran(final double radius) {
        this.radius = radius;
    }

    @Override
    public double luas() {
        return Math.PI * radius * radius;
    }

    @Override
    public double keliling() {
        return 2 * Math.PI * radius;
    }
}
