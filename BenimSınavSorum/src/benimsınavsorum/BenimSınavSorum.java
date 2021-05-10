
package benimsınavsorum;

import java.util.Scanner;

public class BenimSınavSorum {

    public static void main(String[] args) {
        Ogrenci ögrenci=new Ogrenci("Melek", "Yıldız", 135, 2);
        ögrenci.bilgileriGoster();
        ögrenci.getsınıf_bul();
        ögrenci.orta_bul();
        
        /* MezunOgrenci m_ogrenci=new MezunOgrenci("Melek", "Yıldız", 135, 2); // Bu arada alt sınıfı çağırdım...
           m_ogrenci.bilgileriGoster();
           m_ogrenci.orta_bul();*/
        
    }
    
}
class Ogrenci {
    private String ad;
    private String soyad;
    private int okul_no;
    private double ortalama;

    public Ogrenci(String ad, String soyad, int okul_no, double ortalama) {
        this.ad = ad;
        this.soyad = soyad;
        this.okul_no = okul_no;
        this.ortalama = ortalama;
    }
    public void bilgileriGoster(){
        
        System.out.println("Öğrencinin Adı: " +ad);
        System.out.println("Öğrencinin Soyadı: " +soyad);
        System.out.println("Öğrencinin Okul Numarası: " +okul_no);
        System.out.println("Öğrencinin Okul Ortalaması: " +ortalama);
        System.out.println(" ");
        
    }
     private void sınıf_bul(){

           
        Scanner scan=new Scanner(System.in);
       
        System.out.print("Lütfen bir işlem seçiniz(1,2,3,4): ");
        int islem=scan.nextInt();
        
        
        switch(islem){
            case 1:
                
                 System.out.println("1.sınıfsınız");  
               break;
            case 2:
                System.out.println("2.sınıfsınız");
                break;
            
            case 3:
                System.out.println("3.sınıfsınız...");
                break;
            
            case 4:
                System.out.println("4.sınıfsınız...");
            break;
            default :
                System.out.println("Geçersiz işlem yaptınız...");
        }
         System.out.println(" ");

}
     public void getsınıf_bul(){
         
         sınıf_bul();
         
         
     }
     public void orta_bul(){
    
        Scanner s = new Scanner(System.in);
        System.out.println("Lütfen bir sinif seçiniz:");
        String sinif = s.nextLine();
        System.out.println("*******************");
        System.out.println("Lütfen yıl sonu ortlamamınızı giriniz:");
        double ort=s.nextDouble();
         if (sinif.equals("4")) {
            if (ort<1.8) {
                System.out.println("Mezun olamıyorsunuz");  
                 
            }
            else
                System.out.println("Tebrikler mezun oldunuz...");
        }
        if (sinif.equals("3")) {
            if (ort<1.8) {
                System.out.println("Bir sonraki sınıfa geçemiyorsunuz");  
                 
            }
            else
                System.out.println("Tebrikler bir sonraki sınıfa geçtiniz..");
        }
        if (sinif.equals("2")) {
            if (ort<1.8) {
                System.out.println("Bir sonraki sınıfa geçemiyorsunuz");  
                 
            }
            else
                System.out.println("Tebrikler bir sonraki sınıfa geçtiniz..");
        }
        if (sinif.equals("1")) {
            if (ort<1.8) {
                System.out.println("Bir sonraki sınıfa geçemiyorsunuz");  
                 
            }
            else
                System.out.println("Tebrikler bir sonraki sınıfa geçtiniz..");
        }
        else {
            if(sinif.equals("1") || sinif.equals("2") || sinif.equals("3") || sinif.equals("4"))
            {
                System.out.println("Henüz Üniversite "+sinif+". Sınıf ğrencisiniz");
            }
            else{
                 System.out.println("Hatalı sınıf girişi Üniversite öğrencisi değilsiniz");
            }
               
        }
     
}
    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public int getOkul_no() {
        return okul_no;
    }

    public void setOkul_no(int okul_no) {
        this.okul_no = okul_no;
    }

    public double getOrtalama() {
        return ortalama;
    }

    public void setOrtalama(double ortalama) {
        this.ortalama = ortalama;
    }
     
     
}
class MezunOgrenci extends Ogrenci{
    
    public MezunOgrenci(String ad, String soyad, int okul_no, double ortalama) {
        super(ad, soyad, okul_no, ortalama);
    }

    @Override
    public void orta_bul() {
        super.orta_bul(); 
    }

    @Override
    public void bilgileriGoster() {
        super.bilgileriGoster(); 
    }
    
    
}
