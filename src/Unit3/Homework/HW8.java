/*
 Viết chương trình nhập vào n số nguyên, 
đếm số lần xuất hiện của một số nguyên trong mảng vừa nhập.
 */
package Unit3.Homework;

import java.util.Scanner;

public class HW8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int k;
        int dem = 0;
        do {
            System.out.print("Số phần tử của mảng n = ");
            n = sc.nextInt();
        } while (n <= 0);
        int a[] = new int[n];

        for (int i = 0; i < a.length; i++) {

            System.out.print("Phần tử thứ " + (i + 1) + ": ");
            a[i] = sc.nextInt();
        }
        System.out.println("Mảng ban đầu: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + "\t");
        }
        System.out.println();
        System.out.print("Số nguyên bạn muốn kiểm tra: ");
        System.out.print("k = ");
        k = sc.nextInt();

        for (int i = 0; i < a.length; i++) {
            if (a[i] == k) {
                dem += 1;
            }
        }
        System.out.println("Trong mảng số " + k + " xuất hiện " + dem + " lần.");
    }
}
