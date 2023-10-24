import java.util.Scanner;
public class bai6 {
            public static void main(String[] args) {
                // Hỏi người dùng về kích thước ma trận
                Scanner scanner = new Scanner(System.in);
                System.out.print("Nhập số dòng của ma trận: ");
                int m = scanner.nextInt();
                System.out.print("Nhập số cột của ma trận: ");
                int n = scanner.nextInt();

                // Khởi tạo ma trận
                double[][] maTran = new double[m][n];

                // Nhập các phần tử của ma trận
                for (int i = 0; i < maTran.length; i++) {
                    for (int j = 0; j < maTran[i].length; j++) {
                        System.out.print("Nhập giá trị maTran[" + i + "][" + j + "]: ");
                        maTran[i][j] = scanner.nextDouble();
                    }
                }

                // Khai báo biến để lưu giá trị lớn nhất
                double max = maTran[0][0];
                int x = 0;
                int y = 0;

                // Duyệt qua ma trận
                for (int i = 0; i < maTran.length; i++) {
                    for (int j = 0; j < maTran[i].length; j++) {
                        if (maTran[i][j] > max) {
                            max = maTran[i][j];
                            x = i;
                            y = j;
                        }
                    }
                }

                // In ra kết quả
                System.out.println("Tọa độ của phần tử lớn nhất là: (" + x + ", " + y + ")");
                System.out.println("Giá trị của phần tử lớn nhất là: " + max);
            }
        }

