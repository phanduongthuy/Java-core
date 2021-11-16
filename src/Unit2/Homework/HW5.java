/*
Giải phương trình bậc nhất ax + b = 0
 */
package Unit2.Homework;

import java.util.Scanner;

public class HW5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi ban nhap hai so a va b.");
        System.out.print("So a = ");
        float a = sc.nextFloat();
        System.out.print("So b = ");
        float b = sc.nextFloat();
        if (a == 0 && b == 0) {

            System.out.println("Phong trinh co vo so nghiem.");
        } else if (a == 0 && b != 0) {
            System.out.println("Phog trinh vo nghiem.");
        } else {
            System.out.println("Phuong trinh co nghiem x = " + ((-b) / a));
        }
    }
}
