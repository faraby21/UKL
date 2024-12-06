import java.util.Arrays;
import java.util.Scanner;
public class sulit3 {
    public static void main(String[] args) {
        //sebuah data interger berbentuk array
        Scanner in = new Scanner(System.in);
        System.out.println("Masukkan jumlah element array:");
        int jumnlah = in.nextInt();

        int[]arr = new int[jumnlah];
        System.out.println("Masukkan nilai per element:");
        for( int i = 0; i < jumnlah; i++ ){
            arr[i] = in.nextInt();
        }
       


        int batasElement = findBatas(arr);
        
                int[]frekeuensi = new int[batasElement + 1];


                //perulangan yang berfungsi untuk menghitung kemunculan setiap angka dalam array
                for(int num : arr) {
                    frekeuensi[num]++;
                }
                
                
                //perulangan bercabang berfungsi untuk mencetak berulang kali sesuai dengan scanner
                for(int i = 1; i < frekeuensi.length; i++) {
                    if(frekeuensi[i] > 0){
                        System.out.println(i + " muncul " + frekeuensi[i] + " kali ");
                    }
                }
            }
            
            //fungsi yang besifat private
              private static int findBatas(int[] arr) {
                int batas = arr[0];
                        for(int num : arr) {
                            if(num > batas ){
                                batas = num;
                      }
                    }
        return batas;         
    }
}