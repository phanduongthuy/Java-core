/*
 Viết chương trình giải phương trình bậc hai: ax2 + bx + c = 0 
 */
package Unit2.Homework;

import java.util.Scanner;

public class HW4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi ban nhap gia tri cua cac he so a, b, c: ");
        System.out.print("a = ");
        long a = sc.nextLong();
        System.out.print("b = ");
        long b = sc.nextLong();
        System.out.print("c = ");
        long c = sc.nextLong();
        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    System.out.println("Phuong trinh co vo so nghiem.");
                } else {
                    System.out.println("Phuong trinh vo nghiem.");
                }
            } else {
                System.out.println("Phuong trinh co 1 nghiem: " + "x =" + (-c / b));
            }
            return;
        }
        double delta = b * b - 4 * a * c;
        double x1, x2;
        if (delta < 0) {
            System.out.println("Phuong trinh vo nghiem.");
        } else if (delta == 0) {
            x1 = (-b) / (2 * a);
            System.out.println("Phuong trinh co nghiem kep x1 = x2 = " + x1);
        } else {
            x1 = ((-b + Math.sqrt(delta)) / (2 * a));
            x2 = ((-b - Math.sqrt(delta)) / (2 * a));
            System.out.println("Phuong trinh co hai nghiem phan biet x1 = "
                    + x1 + " x2 = " + x2);
        }
    }

}
