/*
Viết chương trình tính tổng S = 1 /1! + 2 /2! + ....+ n / n! 
 */
package Unit2.Homework;

import java.util.Scanner;

class HW9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("n = ");
        int n = sc.nextInt();
        float gt = 1;
        float S = 0;
        for (int i = 1; i <= n; i++) {
            gt = gt * i;
            S = S + i / gt;
        }
        System.out.println("Tong S = " + S);
    }
}
