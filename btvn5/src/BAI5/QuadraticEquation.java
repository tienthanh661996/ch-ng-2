package BAI5;
import java.util.Scanner;
public class QuadraticEquation {
    private double a;
    private double b;
    private double c;
    Scanner sc;

    public QuadraticEquation() {
        this.sc = new Scanner(System.in);
    }

    public QuadraticEquation(double a, double b, double c) {
        this.sc = new Scanner(System.in);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return this.a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return this.b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return this.c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double delta() {
        return this.b * this.b - 4.0 * this.a * this.c;
    }

    public void ptBac2() {
        double delta = this.delta();
        if (delta < 0.0) {
            System.out.println("Phuong trinh vo nghiem");
        } else if (delta == 0.0) {
            System.out.println("Phuong trinh co nghiem kep:" + this.getRootDuplicate());
        } else {
            System.out.println("Phuong trinh co 2 nghiem phan biet: x1 = " + this.getRoot1() + " x2 = " + this.getRoot2());
        }

    }

    public double getRoot1() {
        return (-this.b + Math.sqrt(this.delta())) / (2.0 * this.a);
    }

    public double getRoot2() {
        return (-this.b - Math.sqrt(this.delta())) / (2.0 * this.a);
    }

    public double getRootDuplicate() {
        return -this.b / 2.0 * this.a;
    }

    public void input() {
        System.out.println("hay nhap a:");
        this.a = this.sc.nextDouble();
        System.out.println("hay nhap b:");
        this.b = this.sc.nextDouble();
        System.out.println("hay nhap c:");
        this.c = this.sc.nextDouble();
    }
}
}
