import java.util.Scanner;

public class bai5 {
        public static void main(String[] args) {
// Khai báo mảng số nguyên với 10 phần tử
            int[] mang = new int[10];
            // Nhập giá trị cho các phần tử trong mảng
            Scanner scanner = new Scanner(System.in);
            for (int i = 0; i < mang.length; i++) {
                System.out.print("Nhập giá trị cho mang[" + i + "]: ");
                mang[i] = scanner.nextInt();
            }
            // Gọi phần tử đầu tiên trong mảng là phần tử có giá trị nhỏ nhất
            int min = mang[0];
            // Duyệt mảng từ phần tử thứ 2 đến hết mảng
            for (int i = 1; i < mang.length; i++) {
                // So sánh lần lượt các phần tử tiếp theo với giá trị nhỏ nhất
                if (mang[i] < min) {
                    // Nếu phần tử tiếp theo nhỏ hơn giá trị nhỏ nhất thì gán giá trị nhỏ nhất là phần tử tiếp theo
                    min = mang[i];
                }
            }

            // Kết thúc duyệt mảng. In ra giá trị nhỏ nhất
            System.out.println("Giá trị nhỏ nhất trong mảng là: " + min);
        }
    }