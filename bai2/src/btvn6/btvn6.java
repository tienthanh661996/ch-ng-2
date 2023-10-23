package btvn6;

import javafx.application.Application;
import javafx.stage.Stage;

import java.util.Scanner;

public class btvn6 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("hay nhap di");
        int a = scanner.nextInt();
        int b = 1;
    while (b< a) {
        if (b % 3 ==0&& b % 5==0 && b % 7 ==0 && b % 11 == 0)
        {
            System.out.println(b);}
        b++;
    }
    }
}
