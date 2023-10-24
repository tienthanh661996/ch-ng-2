public class bai5 {
    public static String[] tachChuoiThanhMang(String str, String kyTuDauCung) {
        // Tạo một mảng mới để chứa các từ
        String[] mangTu = str.split(kyTuDauCung);

        // Trả về mảng các từ
        return mangTu;
    }

    public static void main(String[] args) {
        // Nhập chuỗi cần tách
        String str = "Hello, world!";

        // Tách chuỗi thành mảng các từ
        String[] mangTu = tachChuoiThanhMang(str, " ");

        // In ra mảng các từ
        for (String tu : mangTu) {
            System.out.println(tu);
        }
    }
}
