/*
 Viết chương trình tính n! với n là số nguyên dương được nhập từ bàn phím.
 */
package Unit2.Homework;

import java.util.Scanner;

public class HW10 {

    public static void main(String[] args) {
        int giaiThua = 1;
        Scanner sc = new Scanner(System.in);
        System.out.print("n = ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            giaiThua = giaiThua * i;
        }
        System.out.println(n + "! = " + giaiThua);

    }
}
