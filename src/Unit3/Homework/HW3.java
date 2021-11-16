/*
 Viết chương trình sử dụng hàm, kiểm tra số N bất kỳ nhập vào từ bàn phím 
là số lẻ hay số chẵn.( số N được nhập trong hàm Main ).
 */
package Unit3.Homework;

import java.util.Scanner;

public class HW3 {

    public static void KiemTra(int N) {

        if (N % 2 == 0) {

            System.out.println("True");
        }else{
            System.out.println("False");
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Mời bạn nhập số N = ");
        int N;
        do {
            N = sc.nextInt();

            if (N < 0) {
                System.out.print("Mòi bạn nhập lại N = ");                
            }           
        } while (N < 0);
        KiemTra(N);
    }
}
