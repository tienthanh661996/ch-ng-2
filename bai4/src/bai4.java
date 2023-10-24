public class bai4 {
    public static String daoNguocChuoi(String str) {
        // Tạo một đối tượng StringBuffer
        StringBuffer sb = new StringBuffer(str);
        // Đảo ngược chuỗi hiện tại
        sb.reverse();
        // Trả về chuỗi đảo ngược
        return sb.toString();
    }
    public static void main(String[] args) {
        // Nhập chuỗi cần đảo ngược
        String str = "Hello, world!";

        // Đảo ngược chuỗi
        String strDaoNguoc = daoNguocChuoi(str);

        // In ra chuỗi đảo ngược
        System.out.println("Chuỗi đảo ngược: " + strDaoNguoc);
    }
}

}
