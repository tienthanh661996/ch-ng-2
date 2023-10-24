public class bai3 {
    public static void main(String[] args) {
        // Khai báo các biến kiểu String gán bằng các chuỗi bất kỳ để so sánh
        String str1 = "Hello, world!";
        String str2 = "Hello, world!";

        // Dùng phương thức equals() để so sánh 2 chuỗi với nhau và đưa ra thông báo bằng mệnh đề điều kiện if
        if (str1.equals(str2)) {
            System.out.println("Hai chuỗi giống nhau");
        } else {
            System.out.println("Hai chuỗi không giống nhau");
        }
    }
}

}
