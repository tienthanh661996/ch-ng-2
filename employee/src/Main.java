import ra.Employee;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    private static  Employee[]arr= new Employee[50];
    private static int count =0;
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while (true){
            System.out.println("quản lí nhân viên");
            System.out.println("1.hiển thị danh sách \n"+
            "2.thêm moi \n"+
             "3.updata thông tin\n"   +
            "4.xóa thong tin\n"+
            "5.thoát");
            System.out.println("nhập lựa chon");
            int choise = scanner.nextInt();
            switch (choise){
                case 1:
                    hienthi();
                    break;
                    case 2:
                        themmoi();
                    break;
                    case 3:
                        System.out.println("nhap id cần sửa");
                        int staffEditId = scanner.nextInt();
                        updata(staffEditId);
                    break;
                    case 4:
                        System.out.println("nhap id cần xóa");
                        int idDel = scanner.nextInt();
                        deleteStaff(idDel);
                    break;
                    case 5:
                        System.exit(0);
                        break;

            }
        }
        }
        public  static void  hienthi(){
        if (count==0){
            System.out.println("chưa có người dùng");
        }
        for (int i=0;i <count;i++){
            System.out.println(arr[i]);
        }
        }
    public static void themmoi() {
        Scanner sc = new Scanner(System.in);
        System.out.println(" nhap so luong nhan vien can them moi ");
        int quantity = sc.nextInt();
        if (quantity > arr.length - count) {
            System.out.println("vượt quá số lượng");
            return;
        }
        for (int i = 0; i < quantity; i++) {
            Employee employee = new Employee();
            System.out.println("Nhập thông tin cho nhân viên thứ " + (i + 1));
            System.out.println("Nhập id");
            employee.setNhanVienId(sc.nextInt());
            sc.nextLine();
            System.out.println("Nhập tên nhan viên");
            employee.setNhanVienTen(sc.nextLine());
            System.out.println("Nhập giới tính :");
            employee.setGioiTinh(sc.nextLine().equalsIgnoreCase("Nam"));
            System.out.println("Nhập tuổi");
            employee.setTuoi(sc.nextInt());
            sc.nextLine();
            System.out.println("Nhập hệ số lương ");
            employee.setRate(sc.nextDouble());
            arr[count++] = employee;
        }
        System.out.println(" thêm mới thành công");
    }
    public static void updata(int staffEditId) {
        Scanner sc = new Scanner(System.in);
        int index = getIndexByStaff(staffEditId);
        if (index==-1){
            System.out.println("k tìm thấy nhân viên  phù hợp");
            return;
        }
        System.out.println("------------Thông tin nhân viên cũ---------------");
        System.out.println(arr[index]);
        System.out.println("Nhập tên nhân viên mới");
        arr[index].setNhanVienTen(sc.nextLine());
        System.out.println("Nhập giới tính mới : True/flase");
        arr[index].setGioiTinh(sc.nextLine().equalsIgnoreCase("Nam"));
        System.out.println("Nhập tuổi mới");
        arr[index].setTuoi(sc.nextInt());
        sc.nextLine();
        System.out.println("Cập nhật thành công");
    }
    public  static  void  deleteStaff(int idDel){
        Scanner sc = new Scanner(System.in);
        int index = getIndexByStaff(idDel);
        if (index==-1){
            System.out.println("k tìm thấy nhân viên  phù hợp");
            return;
        }
        for (int i = index+1; i <count ; i++) {
            arr[i-1]= arr[i];
        }
        arr[count-1]=null ;
        count--;
        System.out.println("xóa thành công ");
    }

    public static int getIndexByStaff(int id) {
        for (int i = 0; i < count; i++) {
            if (id == arr[i].getNhanVienId()) {
                return i;
            }

        }
        return -1 ;
    }
}

