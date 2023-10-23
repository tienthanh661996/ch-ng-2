
import java.util.Scanner;
public class btvn {
    public static void main(String[] args) {
        Scanner scanner= new Scanner (System.in) ;
    int a = scanner.nextInt();
    System.out.println("nhap di ");
    int b = scanner.nextInt();
    System.out.println("nhap di ");
    int tong = 0;
        for ( int i = a; i <= b; i++) {
            if (i% 2 ==0) {
                tong += i;
                System.out.println( i);
            }
        }
        System.out.println(" tong so chan"+a+"den"+b +"la" +tong);

    }
}
