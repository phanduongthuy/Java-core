/*
 Viết chương trình nhập vào n số nguyên, in ra danh sách số chẵn, số lẻ.
 */
package Unit3.Homework;

import java.util.Scanner;

public class HW5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n, c = 0, l = 0;       
        do {
            System.out.print("Số phần tử của mảng n= ");
            n = sc.nextInt();
        } while (n <= 0);
        int a[] = new int[n];
        int chan[] = new int[n];
        int le[] = new int[n];
        for (int i = 0; i < a.length; i++) {
            System.out.print("Phan tu thu " + (i + 1) + ": ");
            a[i] = sc.nextInt();
        }
        System.out.println("Mảng ban đầu: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + "\t");
        }
        System.out.println();
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                chan[c] = a[i];
                c++;
            } else {
                le[l] = a[i];
                l++;
            }
        }
        System.out.println("Danh sách số chẵn: ");
        for (int i = 0; i < c; i++) {
            System.out.print(chan[i] + "\t");
        }
        System.out.println("");
        System.out.println("Danh sách số lẻ: ");
        for (int i = 0; i < l; i++) {
            System.out.print(le[i] + "\t");
        }

    }
}
