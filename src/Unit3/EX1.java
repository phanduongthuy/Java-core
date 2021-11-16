package Unit3;

import java.util.Scanner;

public class EX1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[5];   //Khai baó mảng

        for (int i = 0; i < a.length; i++) {           // Nhập mảng
            System.out.print("Phan tu thu " + i + ": ");
            a[i] = sc.nextInt();
        }

//        int a[] = new int[5];
//        a[0] = 5;
//        a[1] = 4;
//        a[2] = 3;
//        a[3] = 2;
//        a[4] = 1;
//        //in thong thuong       
//        System.out.println(a[4]);
        //in dung for       
        System.out.println("Mang vua nhap la: ");           //in mảng
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + "\t");
        }
    }
}
