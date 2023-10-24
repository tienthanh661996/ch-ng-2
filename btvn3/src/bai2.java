import java.util.Scanner;
public class bai2 {
    public static void main(String[] args) {
                // Khai báo chuỗi
                String str = "Hello, world!";
                // Khai báo biến ký tự
                char c;
                // Nhập ký tự cần đếm
                Scanner sc = new Scanner(System.in);
                System.out.print("Nhập ký tự cần đếm: ");
                c = sc.next().charAt(0);
                // Khai báo biến đếm
                int count = 0;
                // Duyệt từng ký tự trong chuỗi
                for (int i = 0; i < str.length(); i++) {
                    // So sánh nếu ký tự trong chuỗi bằng ký tự nhập vào thì tăng biến đếm lên 1
                    if (str.charAt(i) == c) {
                        count++;
                    }
                }
                // In ra kết quả
                System.out.println("Số lần xuất hiện của ký tự " + c + " trong chuỗi là: " + count);
            }
        }