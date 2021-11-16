/*
Viết chương trình nhập vào n số nguyên và in mảng đó theo thứ tự ngược lại
 */
package Unit3.Homework;

import java.util.Scanner;

public class HW7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
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
        System.out.println("Mảng sau khi sắp xếp ngược lại: ");
        for (int i = a.length - 1; i >= 0; i = i - 1) {
            System.out.print(a[i] + "\t");
        }
    }
}
