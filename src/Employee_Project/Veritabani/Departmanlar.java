package Employee_Project.Veritabani;

import Employee_Project.Modeller.Departmanlar.BilisimTeklonojileriDepartmani;
import Employee_Project.Modeller.Departmanlar.Departman;
import Employee_Project.Modeller.Departmanlar.InsanKaynaklariDepartmani;
import Employee_Project.Modeller.Departmanlar.YonetimDepartmani;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Departmanlar {
    static private final Departman BILISIM_TEKLONOJILERI_DEPARTMANI = new BilisimTeklonojileriDepartmani();
    static private final Departman YONETIM_DEPARTMANI = new YonetimDepartmani();
    static private final Departman INSAN_KAYNAKLARI_DEPARTMANI = new InsanKaynaklariDepartmani();
    static private List<Departman> DepartmanList = new ArrayList<>(Arrays.asList(BILISIM_TEKLONOJILERI_DEPARTMANI, YONETIM_DEPARTMANI, INSAN_KAYNAKLARI_DEPARTMANI));

    public static List<Departman> getDepartmanList() {
        return DepartmanList;
    }


}


























