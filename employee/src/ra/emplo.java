package ra;

import java.util.Scanner;

public class Employee {
    private int nhanVienId;
    private String nhanVienTen;
    private int tuoi;
    private boolean gioiTinh;
    private double rate;
    private double salary;

    public Employee() {
    }
    public Employee(int nhanVienId,String nhanVienTen,int tuoi,boolean gioiTinh,double rate,double salary){
        this.nhanVienId=nhanVienId;
        this.gioiTinh=gioiTinh;
        this.salary=salary;
        this.tuoi=tuoi;
        this.nhanVienTen=nhanVienTen;
        this.rate=rate;
    }

    public int getNhanVienId() {
        return nhanVienId;
    }

    public void setNhanVienId(int nhanVienId) {
        this.nhanVienId = nhanVienId;
    }

    public String getNhanVienTen() {
        return nhanVienTen;
    }

    public void setNhanVienTen(String nhanVienTen) {
        this.nhanVienTen = nhanVienTen;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public boolean isGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public void inputData(){
        Scanner scanner =new Scanner(System.in);
        System.out.println("nhập id");
        this.nhanVienId=Integer.parseInt(scanner.nextLine());
        System.out.println("nhập ten");
        this.nhanVienTen=scanner.nextLine();
        System.out.println("nhập gioi tinh");
        this.gioiTinh=Boolean.parseBoolean(scanner.nextLine());
        System.out.println("tuoi");
        this.tuoi=Integer.parseInt(scanner.nextLine());
        System.out.println("nhap he so luong");
        this.rate=Double.parseDouble(scanner.nextLine());

    }

    @Override
    public String toString() {
        double salary = rate*130000;
        return "emplo{" +
                "nhanVienId=" + nhanVienId +
                ", nhanVienTen='" + nhanVienTen + '\'' +
                ", tuoi=" + tuoi +
                ", gioiTinh=" + gioiTinh +
                ", rate=" + rate +
                ", salary=" + salary +
                '}';
    }
    public void displayData(){
        System.out.println(this);
    }
}

