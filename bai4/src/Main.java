// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
            public static int demSoTu(String str, int minLength) {
                int count = 0;
                // Duyệt chuỗi, chia chuỗi thành các từ
                for (String word : str.split(" ")) {
                    // Nếu độ dài của từ lớn hơn hoặc bằng giá trị cho trước thì tăng biến đếm lên 1
                    if (word.length() >= minLength) {
                        count++;
                    }
                }
                return count;
            }
            public static void main(String[] args) {
                String str = "Đây là một chuỗi có nhiều từ.";
                int minLength = 3;
                int count = demSoTu(str, minLength);
                System.out.println("Số từ trong chuỗi có độ dài lớn hơn hoặc bằng " + minLength + " là: " + count);
            }
        }