import java.util.Scanner;

public class mudah2{
     public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int bilangan;
     
    
        System.out.println("Masukkan Bilangan:");
        bilangan = s.nextInt();
        
        if(bilangan  % 2 == 0) {
            System.out.println(bilangan  + " Adalah Bilangan Genap");
        }else{
            System.out.println(bilangan + " Adalah Bilangan Ganjil");
        }
    
    }
}


 