import java.util.Scanner;
import java.text.DecimalFormat;
class Main {
  public static void main(String[] args) {
    
    System.out.println("sayı giriniz : ");//buradan sayı aldık
    Scanner cagir = new Scanner(System.in);
    int sayi = cagir.nextInt();

    int sayac = 1;
    for(int i = 1;i<=sayi;i++){
      sayac = sayac * sayi;
    }
    System.out.println(sayac);



   {

  }