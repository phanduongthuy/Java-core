package Unit1;

import java.util.Scanner;

public class HW2 {

    public static void main(String[] arge) {

        Scanner Sc = new Scanner(System.in);

        System.out.println("Nhap so a: ");
        int a = Sc.nextInt();
        System.out.println("Nhap so b: ");
        int b = Sc.nextInt();
        System.out.println("Tong = " + (a + b));
        System.out.println("Hieu = " + (a - b));
        System.out.println("Tich = " + (a * b));
        System.out.println("Thuong = " + (a / b));
        System.out.println("Phan du = " + (a % b));

    }
}
