package btvn5;

import javafx.application.Application;
import javafx.stage.Stage;

import java.util.Scanner;

public class btvn5 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

            @Override
            public void start(Stage primaryStage) {
                int n;
                System.out.println("Nhập giá trị của n: ");
                Scanner scanner = new Scanner(System.in);
                n = scanner.nextInt();
                for (int i = 2; i <= n; i++) {
                    boolean isPrime = true;
                    for (int j = 2; j * j <= i; j++) {
                        if (i % j == 0) {
                            isPrime = false;
                            break;
                        }
                    if (isPrime) {
                        System.out.println(i);
                    }
                }
            }
        }

    }