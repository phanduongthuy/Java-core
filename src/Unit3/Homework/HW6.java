/*
 Viết chương trình xóa đi một phần tử tại chỉ mục k, 
với k được nhập vào từ bàn phím.
 */
package Unit3.Homework;

import java.util.Scanner;

public class HW6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, k, j = 0;
        do {
            System.out.print("Số phần tử của mảng n= ");
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
        System.out.println("");
        do {
            System.out.print("Nhập k = ");
            k = sc.nextInt();
        } while (k < 0 || k > (n - 1));
        for (int i= 0; i < a.length; i++) {
            if (i != k) {
                a[j] = a[i];
                j++;
            }
        }
        System.out.println("Mảng sau khi xóa phần tử tại chỉ mục " + k + " là: ");
        for (int i = 0; i < j  ; i++) {
            System.out.print(a[i] + "\t");
        }
    }
}
