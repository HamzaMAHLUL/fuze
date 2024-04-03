//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println(" Lütfen Füzenin Menzilini Giriniz : ");
        double menzil = scan.nextDouble();
        System.out.println("Lütfen Füzenin Ağırlığını Giriniz : ");
        double agirlik = scan.nextDouble();
        Missile missile = new Missile(menzil, agirlik);
        System.out.println("Füze Menzili: " + missile.getMenzil() + " km");
        System.out.println("Füze Ağırlığı: " + missile.getAgirlik() + " kg");
        System.out.println("Füze özellikleri, hem kara hedeflerine yönelik hem de hava hedeflerine yönelik olarak tasarlandı.");



        System.out.println("NOT: Üzerinde pilot olmayan uçaklara UAV denir. ");
        System.out.print("UAV'nın boş ağırlığını giriniz : ");
        double  bos_agirlik = scan.nextDouble();
        System.out.print("UAV'nın maksimum kalkış ağırlığını giriniz: ");
        double maksimum_kalis_agiligi = scan.nextDouble();
        System.out.print("UAV füze taşıyabilir mi? (true/false): ");
        boolean fuzeTasiyabilirMi = scan.nextBoolean();
        int maksimumFuzeSayisi = 0;
        if(fuzeTasiyabilirMi){
            System.out.println("UAV'nın maksimum füze sayısını girin: ");
            maksimumFuzeSayisi = scan.nextInt();
        }
        UAV uav = new UAV(bos_agirlik,maksimum_kalis_agiligi,fuzeTasiyabilirMi,maksimumFuzeSayisi);

        System.out.println("UAV Boş Ağırlığı: " + uav.getBosAgirlik() + " kg");
        System.out.println("UAV Maksimum Kalkış Ağırlığı: " + uav.getMaksimumKalisAgiligi()+ " kg");
        System.out.println("UAV Füze Taşıyabilir Mi: " + uav.getFuzeTasiyabilirMi());
        if (fuzeTasiyabilirMi) {
            System.out.println("UAV Maksimum Füze Sayısı: " + uav.getMaksimumFuzeSayisi());
        }

        uav.fuzeAtesle();



    }
}