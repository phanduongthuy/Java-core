/*
 Nhập vào mảng n phần tử từ bàn phím và sử dụng thuật toán Selection sort 
để sắp xếp theo chiều tăng dần
 */
package Unit3.Homework;

import java.util.Scanner;

public class HW4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n, slsort;
        do {
            System.out.print("Số phần tử của mảng n= ");
            n = sc.nextInt();
        } while (n <= 0);
        int a[] = new int[n];
        for (int i = 0; i < a.length; i++) {
            System.out.print("Phan tu thu " + (i + 1) + ": ");
            a[i] = sc.nextInt();
        }
        System.out.println("Mảng ban đầu: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + "\t");
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    slsort = a[i];
                    a[i] = a[j];
                    a[j] = slsort;
                }
            }
        }
        System.out.println("");
        System.out.println("Mảng sau khi được sắp xếp: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + "\t");
        }
    }
}
