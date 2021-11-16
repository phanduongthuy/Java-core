/*
 ViếViết chương trình sử dụng hàm trả về tên của một tháng trong năm
khi truyền vào các số từ 1 đến 12 và thông báo lỗi
nếu số truyền vào không nằm trong khoảng từ 1 đến 12.
 */
package Unit3.Homework;

import java.util.Scanner;

public class HW1 {

    public static void tenThang(int thang) {
        switch (thang) {
            case 1:
                System.out.println("Tháng một.");
                break;
            case 2:
                System.out.println("Tháng hai.");
                break;
            case 3:
                System.out.println("Tháng ba.");
                break;
            case 4:
                System.out.println("Tháng tư.");
                break;
            case 5:
                System.out.println("Tháng năm.");
                break;
            case 6:
                System.out.println("Tháng sáu.");
                break;
            case 7:
                System.out.println("Tháng bảy.");
                break;
            case 8:
                System.out.println("Tháng tám.");
                break;
            case 9:
                System.out.println("Tháng chín.");
                break;
            case 10:
                System.out.println("Tháng mười.");
                break;
            case 11:
                System.out.println("Tháng mười một.");
                break;
            case 12:
                System.out.println("Tháng mười hai.");
                break;
            default:
                System.out.println("Tháng bạn nhập không hợp lệ.");
                break;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Mời bạn nhập tháng bằng số: ");
        int n;
        do {

            n = sc.nextInt();
            tenThang(n);
            if (n < 1 || n > 12) {
                System.out.print("Mòi bạn nhập lại n = ");
            }

        } while (n < 1 || n > 12);

    }
}
