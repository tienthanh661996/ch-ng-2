public class Main {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int n = arr.length;

        // Tìm phần tử lớn nhất trong mảng
        int max = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        // Tìm phần tử lớn thứ hai trong mảng
        int secondMax = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > secondMax && arr[i] < max) {
                secondMax = arr[i];
            }
        }

        // In ra kết quả
        System.out.println("Phần tử lớn nhất trong mảng là: " + max);
        System.out.println("Phần tử lớn thứ hai trong mảng là: " + secondMax);
    }
}
