// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(3, 4, 5);
        System.out.println("Thông tin tam giác" + triangle);
        System.out.println("Chu vi tam giác" + triangle.getPerimeter());
        System.out.println("Diện tích tam giác" + triangle.getArea());
    }
}