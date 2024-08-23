package Employee_Project.Veritabani;

import Employee_Project.Modeller.Calisanlar.Calisan;
import java.util.ArrayList;

public class Calisanlar {

    private static ArrayList<Calisan> calisanList=new ArrayList<>();

    public static ArrayList<Calisan> getCalisanList() {
        return calisanList;
    }


    public static void addACalisan(Calisan calisan) {
        // burası doldurulacak duruma göre arrayliste geri dönülecek
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
