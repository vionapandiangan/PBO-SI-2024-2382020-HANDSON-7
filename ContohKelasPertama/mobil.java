package ContohKelasPertama;

public class mobil {
    String warna;
    String merk;
    int kecepatanMaks;

    public mobil (String warna, String merk, int kecepatanMaks) {
        this.warna = warna;
        this.merk = merk;
        this.kecepatanMaks = kecepatanMaks;
    }

    public void TampilanInfo() {
        System.out.println("Warna : "+ warna);
        System.out.println("Merek : "+ merk);
        System.out.println("Kecepatan : "+ kecepatanMaks);
    }

    public String getWarna(){
        return warna;
    }

    public String getMerk(){
        return merk;
    }

    public int getKecepatanMaks(){
        return kecepatanMaks;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public void setKecepatanMaks(int kecepatanMaks) {
        this.kecepatanMaks = kecepatanMaks;
    }
}
