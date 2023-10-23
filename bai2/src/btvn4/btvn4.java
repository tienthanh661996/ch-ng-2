package btvn4;
import java.util.Scanner;
import javafx.application.Application;
import javafx.stage.Stage;
import java.util.Scanner;
public class btvn4 extends Application {

    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) {

                System.out.println("Nhập giá trị của n: ");
                Scanner scanner = new Scanner(System.in);
                int n = scanner.nextInt();
                for (int i = 2; i <= n; i++) {
                    // Kiểm tra xem i có phải là số nguyên tố hay không
                    boolean isPrime = true;
                    for (int j = 2; j * j <= i; j++) {
                        if (i % j == 0) {
                            isPrime = false;
                            break;
                        }
                    }
                    if (isPrime) {
                        System.out.println(i);
                    }
                }
            }
        }