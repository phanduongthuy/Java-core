/*
 Viết chương trình nhập vào n số nguyên, 
tính giá trị trung bình của các phần tử trong mảng 
rồi in ra màn hình n số nguyên đó, 
và giá trị trung bình của n số nguyên vừa nhập.
 */
package Unit3.Homework;

import java.util.Scanner;

public class HW18 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        float Sum = 0;
        float trungBinh = 0;
        do {
            System.out.print("Số phần tử của mảng n= ");
            n = sc.nextInt();
        } while (n < 0);
        int a[] = new int[n];
        for (int i = 0; i < a.length; i++) {
            System.out.print("Phan tu thu " + (i + 1) + ": ");
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < a.length; i++) {
            Sum = Sum + a[i];
            trungBinh = Sum / n;
        }
        System.out.println("Danh sách mảng a:");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + "\t");
        }
        System.out.println("");
        System.out.println("Giá trị trung bình của "
                + n + " số nguyên vừa nhập là: " + trungBinh);
    }

}
