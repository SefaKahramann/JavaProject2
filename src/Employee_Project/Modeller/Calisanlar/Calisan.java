package Employee_Project.Modeller.Calisanlar;

import Employee_Project.Modeller.Departmanlar.BilisimTeklonojileriDepartmani;
import Employee_Project.Modeller.Departmanlar.Departman;
import Employee_Project.Modeller.Departmanlar.InsanKaynaklariDepartmani;
import Employee_Project.Modeller.Departmanlar.YonetimDepartmani;
import Employee_Project.Veritabani.Calisanlar;
import Employee_Project.Veritabani.Departmanlar;

public class Calisan {

    private String calisanId;
    private String adSoyad;
    private int maas;
    private Departman Departman;
    private String isimKodu = "";

    public Calisan(String adSoyad, int maas, String departmanKodu) {
        setAdSoyad(adSoyad);
        setMaas(maas);
        setDepartman(departmanKodu);
        this.setCalisanId();
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

    public String getCalisanId() {
        return this.calisanId;
    }

    public Departman getDepartman() {
        return this.Departman;
    }

    public String getDepartmanAdi() {
        String departmanAdi = this.Departman.getDepartmanKodu();
        switch (departmanAdi) {
            case "YD":
                return "Yönetim Depertmanı";
            case "BTD":
                return "Bilişim Teknolojileri Departmanı";
            case "IKD":
                return "İnsan Kaynakları Departmanı";
            default:
                return "Bilinmeyen Departman";
        }
    }

    public static void zamYap(String calisanId) {
        boolean bulundu = false;
        for (Calisan calisan : Calisanlar.getCalisanList()) {
            if (calisan.getCalisanId().equals(calisanId)) {
                bulundu = true;
                String departmanKodu = calisan.getDepartmanAdi();
                double zamOrani = 0;
                switch (departmanKodu) {
                    case "IKD":
                        zamOrani = new InsanKaynaklariDepartmani().getZamOrani();
                        break;
                    case "BTD":
                        zamOrani = new BilisimTeklonojileriDepartmani().getZamOrani();
                        break;
                    case "YD":
                        zamOrani = new YonetimDepartmani().getZamOrani();
                        break;
                    default:
                        System.out.println("Geçersiz departman kodu: " + departmanKodu);
                        return;
                }
                int mevcutMaas = calisan.getMaas();
                int yeniMaas = (int) (mevcutMaas * (1 + zamOrani));
                calisan.setMaas(yeniMaas);

                System.out.println(calisan.getAdSoyad() + " isimli çalışanın yeni maaşı: " + yeniMaas);
                break;
            }
        }
        if (!bulundu) {
            System.out.println("Çalışan ID'si bulunamadı: " + calisanId);
        }
    }

    public void setAdSoyad(String adSoyad) {
        this.adSoyad = adSoyad;
    }

    public void setMaas(int maas) {
        this.maas = maas;
    }

    public int getMaas() {
        return maas;
    }

    public String getAdSoyad() {
        return adSoyad;
    }

    @Override
    public String toString() {
        return "Çalışan ID: " + this.calisanId + "\n" +
                "Ad Soyad: " + this.adSoyad + "\n" +
                "Maaş: " + this.maas + "\n" +
                "Departman: " + getDepartmanAdi() + "\n";
    }
}
