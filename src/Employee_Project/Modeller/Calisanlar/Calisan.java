package Employee_Project.Modeller.Calisanlar;

import Employee_Project.Veritabani.Calisanlar;
import Employee_Project.Modeller.Departmanlar.Departman;
import Employee_Project.Veritabani.Departmanlar;

public class Calisan {

    private String calisanId;
    private String adSoyad;
    private int maas;
    private Departman Departman;
    private String isimKodu = "";

    public Calisan(String adSoyad, int maas, String departmanKodu) {
        this.adSoyad = adSoyad;
        this.maas = maas;
        setDepartman(departmanKodu);
        this.setCalisanId();    // constructor çalıştığında, aşağıda tanımlayacağınız bu metod vasıtasıyla tekil bi ID alacak...
        // Örn: Şirkette 257 calisan var, Bilişim teklonojileri departmaninda Mehmet Ali Bulut kaydedilecek olsun,
        // Mehmet Ali icin ID 'BTD258MAB' olmalıdır.
        Calisanlar.addACalisan(this);
    }

    private void setDepartman(String departman) {
        for (Departman A : Departmanlar.getDepartmanList()) {
            if (A.getDepartmanKodu().equalsIgnoreCase(departman)) {
                this.Departman = A;
                break;
            }
        }
    }

    private void setCalisanId() {
        int calisanSayisi = Calisanlar.getCalisanList().size() + 1;
        this.isimKodu = getCalisanIsimKodu();
        this.calisanId = Departman.getDepartmanKodu() + calisanSayisi + this.isimKodu;
    }

    private String getCalisanIsimKodu() {
        String[] isimler = this.adSoyad.split(" ");
        String isminBasHarfleri = "";
        for (String e : isimler) {
            isminBasHarfleri += e.charAt(0);
        }
        return isminBasHarfleri.toUpperCase();
    }


    // Calisanin id sini almak icin basit getter method
    public String getCalisanId() {
        return this.calisanId;
    }

    // Calisanin departmanini almak icin basit getter method
    public Departman getDepartman() {
        return this.Departman;
    }


    // Departman adini verebilmek için bir method
    public String getDepartmanAdi() {

        // TODO getDepartmanAdi() methodunu doldurunuz
        // İpucu: Departman Kodu YD ise departman adi Yonetim Departmani olarak kaydedilmelidir.


        return "???? ";// TODO burayi unutmayin
    }

    // Calisana zam yapilmasi için gerekli bir method
    public static void zamYap(String calisanId) {

        // TODO zamYap() methodunu doldurunuz
        // İpucu:Calisan ID si kullanilarak yapilmalidir, diğer attributelarin aynilarindan 1 er tane daha olabilirdi.


    }

    // Calisanlari yazdırmak için gerekli bir override
    @Override
    public String toString() {

        // TODO toString() metheodunu doldurunuz
        // İpucu: Detayli anlatim EmployeesRequirements.pdf içerisinde.

        return "???? ";// TODO burayi unutmayin


    }
}
