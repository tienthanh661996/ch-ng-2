// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
//toán tử ++,--
        //hậu tố
        int a =10;
        a++;//a=11;
        //a--; // a=9;
        System.out.println(a);
        // áp dụng vào 1 biểu thức toán học
        int c = ++a*2;  //c=22, a =11
        //a++*2  thì c=20
        System.out.println(c);
        //kết luận sủ dụng tền tố ++ hya --
        //thì phép toán  ++a trả về kết qyar tăng
        //ngược lại thì tr về kết qyar trước khi tăng
    // if ........else
        if (5>3){
            System.out.println("5 lớn hớn 3");}
        else {
            System.out.println("nhỏ hơn");
        }
        if ( a<5){
            System.out.println("yếu");}
            else if (a<6.5){
                System.out.println("tb");
            }else {
            System.out.println("gioi");
        }
//loop vòng lặp
       // for      i
        for (int i = 0; i < 100; i++) {
            System.out.println("phần tử"+i);
            if (i ==5) {
                break;
                //   continue;
            }
            System.out.println("phan tgu"+i);
            }
        int dem=0;
        for (int i = 0; i <10 ; i++) {
            for (int j = 0; j < 5; j++) {
                dem++;
                System.out.println(dem);
            }

        }
        }

        }



