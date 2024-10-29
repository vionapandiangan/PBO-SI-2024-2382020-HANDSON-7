package pewarisan;

public class Kendaraan {
    private String merk;
    private  String model;
    private int tahunProduksi;

    public Kendaraan(String merk, String model, int tahunProduksi) {
        this.merk = merk;
        this.model = model;
        this.tahunProduksi = tahunProduksi;
    }

    public void tampilkanInfo(){
        System.out.println("Merek: "+ merk);
        System.out.println("Model: "+ model);
        System.out.println("Tahun Produksi: "+ tahunProduksi);
    }
}
