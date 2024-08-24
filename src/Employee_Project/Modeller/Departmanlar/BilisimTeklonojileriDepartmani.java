package Employee_Project.Modeller.Departmanlar;

public class BilisimTeklonojileriDepartmani implements Departman {

    final String departmanKodu = "BTD";

    final double zamOrani = 0.10;


    @Override
    public double getZamOrani() {
        return zamOrani;
    }

    @Override
    public String getDepartmanKodu() {
        return departmanKodu;
    }
}
