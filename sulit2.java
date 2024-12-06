import java.util.Scanner;
public class sulit2{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Masukkan jumlah element array:");
        int jumnlah = in.nextInt();

        int[]array = new int[jumnlah];
        System.out.println("Masukkan nilai per element:");
        for( int i = 0; i < jumnlah; i++ ){
            array[i] = in.nextInt();
        }
       

boolean cekDuplikat = false;

for ( int i = 0; i < array.length - 1; i++) {
    for (int j = i + 1; j < array.length; j++) {
        if (array[i] == array[j]) {
            cekDuplikat = true;
            System.out.println("Array memiliki elemen duplikat: " + array[i]);
        }
    }
}

if (!cekDuplikat) {
    System.out.println("Array tidak memiliki elemen duplikat.");
}
}
}

