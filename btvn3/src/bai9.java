import java.util.Scanner;
public class bai9 {
        public static void main(String[] args) {
            // Khai báo mảng số nguyên gồm 10 phần tử
            int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

            // Nhập X là phần tử cần xoá
            Scanner scanner = new Scanner(System.in);
            System.out.print("Nhập X: ");
            int X = scanner.nextInt();

            // Tìm X xem có xuất hiện trong mảng không. Nếu xuất hiện chỉ ra vị trí của X. Giả sử vị trí này là: index_del
            int index_del = -1;
            for (int i = 0; i < array.length; i++) {
                if (array[i] == X) {
                    index_del = i;
                    break;
                }
            }

            // Nếu X không tồn tại trong mảng thì hiển thị thông báo
            if (index_del == -1) {
                System.out.println("Không tìm thấy phần tử cần xoá.");
                return;
            }

            // Thực hiện xoá phần tử X khỏi mảng
            for (int i = index_del; i < array.length - 1; i++) {
                array[i] = array[i + 1];
            }

            // In ra mảng sau khi xoá
            System.out.println("Mảng sau khi xoá:");
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + " ");
            }
        }
    }