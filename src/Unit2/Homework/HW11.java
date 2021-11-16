/*
 Viết chương trình tính tổng S = 1 + 1/2 + 1/3 + ... + 1/n với n nguyên dương được nhập từ bàn phím
 */
package Unit2.Homework;

import java.util.Scanner;

public class HW11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("n = ");
        int n = sc.nextInt();
        float S = 0;
        for (float i = 1; i <= n; i++) {
            S = S + (1 / i);
        }
        System.out.println("Tong S = " + S);

    }

}
