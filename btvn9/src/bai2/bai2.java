package bai2;

import java.util.Stack;
public class bai2 {
    public static void main(String[] args) {
                // Tạo một stack để lưu trữ các từ.
                Stack<String> stack = new Stack<>();
                // Nhập số lượng các từ.
                int numberOfWord = Integer.parseInt(System.console().readLine("Nhập số lượng các từ: "));
                // Tạo một vòng lặp for với số lần lặp bằng số lượng các từ.
                for (int i = 0; i < numberOfWord; i++) {
                    // Nhập một từ và push vào stack.
                    String word = System.console().readLine("Nhập từ thứ {}: ".format(String.valueOf(i + 1)));
                    stack.push(word);
                }

                // Tạo một vòng lặp while để duyệt qua stack và in ra các từ theo thứ tự đảo ngược.
                while (!stack.isEmpty()) {
                    // In ra một từ từ stack.
                    System.out.println(stack.pop().toString());
                }
            }
        }

