// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.LinkedList;
public class Main {
        public static class QueuePrint {

            public static void main(String[] args) {
                // Tạo một danh sách đầu vào.
                LinkedList<Integer> listInput = new LinkedList<>();
                listInput.add(1);
                listInput.add(2);
                listInput.add(3);
                listInput.add(4);
                listInput.add(5);

                // Tạo một queue có kích thước bằng kích thước của danh sách đầu vào.
                LinkedList<Integer> queue = new LinkedList<>();
                for (int i = 0; i < listInput.size(); i++) {
                    queue.add(listInput.get(i));
                }



                // Duyệt qua queue và in ra các phần tử.
                while (!queue.isEmpty()) {
                    System.out.println(queue.removeFirst());
                }
            }
        }

    }