package Unit1;

import java.util.Scanner;

public class HW3 {

    public static void main(String[] args) {

        Scanner Sc = new Scanner(System.in);
        String x;
        System.out.println("Nhap so a: ");
        int a = Sc.nextInt();
        System.out.println("Nhap so b: ");
        int b = Sc.nextInt();
        x = (a > b) ? "a" : "b";
        System.out.println(x);

    }

}
