package ContohKelasPertama;

public class main {
    public static void main(String[] args) {
        mobil mobilHitam = new mobil("Hitam", "Toyota", 160);
        mobilHitam.TampilanInfo();

        //mobil mobilMerah = new abstraksi.Mobil("Merah", "Honda", 200);
        //mobilMerah.TampilanInfo();

        System.out.println("Warna : "+ mobilHitam.getWarna());
    }
}