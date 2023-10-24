public class bai3 {

    public static int tinhTongDuongCheoChinh(int[][] maTran) {
        int n = maTran.length;
        int tong = 0;
        for (int i = 0; i < n; i++) {
            tong += maTran[i][i];
        }
        return tong;
    }

    public static void main(String[] args) {
        // Tạo ma trận vuông có sẵn
        int[][] maTran = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        // Tính tổng các phần tử của đường chéo chính
        int tong = tinhTongDuongCheoChinh(maTran);

        // In kết quả
        System.out.println("Tổng các phần tử của đường chéo chính là: " + tong);
    }
}
