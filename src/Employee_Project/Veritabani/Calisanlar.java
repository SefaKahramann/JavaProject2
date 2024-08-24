package Employee_Project.Veritabani;
import Employee_Project.Modeller.Calisanlar.Calisan;
import java.util.ArrayList;

public class Calisanlar {

    private static ArrayList<Calisan> calisanList=new ArrayList<>();

    public static ArrayList<Calisan> getCalisanList() {
        return calisanList;
    }
    public static void addACalisan(Calisan calisan) {
        calisanList.add(calisan);
    }
    public static void deleteACalisanWithId(String calisanId) {
        for (Calisan e:calisanList) {
            if (e.equals(calisanId)) {
                calisanList.remove(e);
            } else
                System.out.println("ID Bulunamadı");
        }
    }

    public static void printDepartmandakiCalisanlar(String departmanKodu) {
        boolean bulundu=false;
        for (Calisan calisan: calisanList){
            if (calisan.getDepartman().getDepartmanKodu().equalsIgnoreCase(departmanKodu)){
                System.out.println(calisan);
                bulundu=true;
            }
        }
        if (!bulundu){
            System.out.print("Departmanda çalışan bulunamadı : "+departmanKodu);
        }
    }

    public static void printCalisanlar() {
        if (!calisanList.isEmpty()){
            for (Calisan calisan:calisanList){
                System.out.print("Calişanlar : "+calisan);
            }
        }else {
            System.out.println("Çalışan listesi boş.");
        }
    }
}
