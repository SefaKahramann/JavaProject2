package Employee_Project.Veritabani;

import Employee_Project.Modeller.Calisanlar.Calisan;
import java.util.HashMap;
import java.util.Map;

public class Calisanlar {

    private static Map<String,String > calisanList=new HashMap<>();

    public static Map<String,String> getCalisanList() {
        return calisanList;
    }


    public static void addACalisan(Calisan calisan) {
        calisanList.put(calisan.getCalisanId(),calisan);
    }

    public static void deleteACalisanWithId(String calisanId) {


        // TODO Bir çalışan silmek için gerekli method. deleteACalisanWithId() methodunu doldurunuz



    }


    public static void printDepartmandakiCalisanlar(String departmanKodu) {

        // TODO  Departman kodu verilerek, konsola sadece o departmanda calisanlari yazdirmak için
        //       printDepartmandakiCalisanlar() methodunu doldurunuz





    }


    public static void printCalisanlar() {

        // TODO  Calisanlari konsola yazdirmak için printCalisanlar() methodunu doldurun




    }
}
