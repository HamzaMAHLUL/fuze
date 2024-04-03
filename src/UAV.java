public class UAV {

 private double BosAgirlik;
 private double MaksimumKalisAgiligi;
 private boolean FuzeTasiyabilirMi ;
 private int MaksimumFuzeSayisi;



 public UAV(double BosAgirlik , double MaksimumKalisAgiligi,boolean FuzeTasiyabilirMi ,int MaksimumFuzeSayisi){
    this.BosAgirlik = BosAgirlik  ;
    this.MaksimumKalisAgiligi = MaksimumKalisAgiligi ;
    this.FuzeTasiyabilirMi = FuzeTasiyabilirMi ;
    this.MaksimumFuzeSayisi = MaksimumFuzeSayisi ;

 }
 public double getBosAgirlik(){

     return BosAgirlik ;
 }

 public double getMaksimumKalisAgiligi(){
     return   MaksimumKalisAgiligi;
 }
     public boolean getFuzeTasiyabilirMi() {
        return FuzeTasiyabilirMi ;
     }

     public int getMaksimumFuzeSayisi(){

     return MaksimumFuzeSayisi;
     }

     public void fuzeAtesle(){

     if(FuzeTasiyabilirMi)
     {
         System.out.println("UAN'dan füze ateşlendi.");

     }else {
         System.out.println("Bu UAV füze taşıyamaz.");
     }

     }

}
