package bai3;
import java.util.Scanner;
public class fan1 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Tạo đối tượng Fan 1
            FAN fan1 = new FAN();
            fan1.setSpeed(FAST);
            fan1.setRadius(10);
            fan1.setColor("yellow");
            fan1.setOn(true);

            // Tạo đối tượng Fan 2
            FAN fan2 = new FAN();
            fan2.setSpeed(MEDIUM);
            fan2.setRadius(5);
            fan2.setColor("blue");
            fan2.setOn(false);

            // Hiển thị thông tin các đối tượng
            System.out.println("Fan 1: " + fan1);
            System.out.println("Fan 2: " + fan2);
        }
    }
