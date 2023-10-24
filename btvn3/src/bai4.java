import java.util.Scanner;
public class bai4 {
            public static void main(String[] args) {
                // Hỏi người dùng về kích thước của mảng
                Scanner scanner = new Scanner(System.in);
                System.out.print("Nhập số dòng của mảng: ");
                int m = scanner.nextInt();
                System.out.print("Nhập số cột của mảng: ");
                int n = scanner.nextInt();
                // Khởi tạo mảng
                double[][] maTran = new double[m][n];
                // Nhập các phần tử của mảng
                for (int i = 0; i < maTran.length; i++) {
                    for (int j = 0; j < maTran[i].length; j++) {
                        System.out.print("Nhập giá trị maTran[" + i + "][" + j + "]: ");
                        maTran[i][j] = scanner.nextDouble();
                    }
                }
                // Hỏi người dùng muốn tính tổng của cột mấy
                System.out.print("Bạn muốn tính tổng của cột mấy? ");
                int cot = scanner.nextInt();

                // Tính tổng các phần tử của cột đó
                double tong = 0;
                for (int i = 0; i < maTran.length; i++) {
                    tong += maTran[i][cot];
                }

                // In kết quả
                System.out.println("Tổng các phần tử của cột " + cot + " là: " + tong);
            }
        }