/*
Viết chương trình sử dụng hàm tính diện tích hình tròn
với bán kính r bất kỳ được nhập từ bàn phím.
 */
package Unit3.Homework;

import java.util.Scanner;

public class HW2 {

    public static double DienTich_HinhTron(double r) {
        System.out.println("Diện tích hình tròn bán kính " + r + " : S = " + (r * r * 3.14));
        return (r * r * 3.14);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Mời bạn nhập bán kính r = ");
        double r;
        do {
            r = sc.nextDouble();

            if (r < 0) {
                System.out.print("Mời bạn nhập lại r = ");

            }
        } while (r < 0);
        DienTich_HinhTron(r);
    }
}
