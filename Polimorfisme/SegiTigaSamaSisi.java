package Polimorfisme;

public class SegiTigaSamaSisi extends BangunDatar{
    private double sisi;

    public SegiTigaSamaSisi(final double sisi) {
        this.sisi = sisi;
    }

    @Override
    public double luas() {
        return (Math.sqrt(3) / 4) * sisi * sisi;
    }

    @Override
    public double keliling() {
        return sisi * 3;
    }
}
