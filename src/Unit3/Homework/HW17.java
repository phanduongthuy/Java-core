/*
 Viết chương trình nhập vào n số nguyên dương và tìm số nguyên lớn nhất của mảng 
rồi in ra màn hình số nguyên lớn nhất đó kèm theo chỉ mục của nó.
 */
package Unit3.Homework;

import java.util.Scanner;

public class HW17 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.print("Số phần tử của mảng n= ");
            n = sc.nextInt();
        } while (n <= 0);
        int a[] = new int[n];

        for (int i = 0; i < a.length; i++) {
            do {
                System.out.print("Phan tu thu " + (i + 1) + ": ");
                a[i] = sc.nextInt();
            } while (a[i] <= 0);
        }
        System.out.println("Mảng bạn vừa nhập:");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + "\t");
        }
        System.out.println();
        int max = a[0];
        int chiMucMax = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
                chiMucMax = i;
            }

        }
        System.out.println("Số nguyên lớn nhất của mảng là: "
                + max + "\t" + "Tại a[" + chiMucMax + "]");

    }
}
