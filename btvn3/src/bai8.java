import java.util.Scanner;
public class bai8 {
        public static void main(String[] args) {
            // Khai báo mảng số nguyên gồm 10 phần tử
            int[] array = new int[10];

            // Khởi tạo mảng với giá trị mặc định là 0
            for (int i = 0; i < array.length; i++) {
                array[i] = 0;
            }
            // Nhập X là số cần chèn
            Scanner scanner = new Scanner(System.in);
            System.out.print("Nhập X: ");
            int X = scanner.nextInt();

            // Nhập vào vị trí index cần chèn X vào trong mảng
            System.out.print("Nhập index: ");
            int index = scanner.nextInt();

            // Nếu index <= -1 và index >= array.length – 1 thì hiển thị không chèn được phần tử vào mảng.
            if (index <= -1 || index >= array.length) {
                System.out.println("Không chèn được phần tử vào mảng.");
                return;
            }
            // Duyệt mảng từ vị trí index đến hết mảng
            for (int i = array.length - 1; i >= index; i--) {
                // Di chuyển các phần tử từ vị trí i + 1 xuống vị trí i
                array[i] = array[i - 1];
            }

            // Gán giá trị X vào vị trí index
            array[index] = X;

            // In ra mảng
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + " ");
            }
        }
    }
