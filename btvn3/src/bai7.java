import java.util.Scanner;
public class bai7 {
            public static void main(String[] args) {
                // Khai báo 2 mảng số
                int[] array1 = new int[10];
                int[] array2 = new int[20];

                // Nhập giá trị cho 2 mảng
                Scanner scanner = new Scanner(System.in);
                for (int i = 0; i < array1.length; i++) {
                    array1[i] = scanner.nextInt();
                }
                for (int i = 0; i < array2.length; i++) {
                    array2[i] = scanner.nextInt();
                }

                // Gộp 2 mảng vào mảng thứ 3
                int[] array3 = new int[array1.length + array2.length];
                for (int i = 0; i < array1.length; i++) {
                    array3[i] = array1[i];
                }
                for (int i = 0; i < array2.length; i++) {
                    array3[array1.length + i] = array2[i];
                }

                // In ra mảng thứ 3
                for (int i = 0; i < array3.length; i++) {
                    System.out.print(array3[i] + " ");
                }
            }
        }