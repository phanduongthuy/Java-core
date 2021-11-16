/*
 Tạo 1 lớp Main để gọi lớp sinh viên. 
Nhập vào thông tin của n sinh viên sau đó hiển thị danh sách sinh viên.
 */
package Unit4.Homework;

import java.util.Scanner;

public class Main_HW3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Số sinh viên: ");
        int n = sc.nextInt();
        SinhVien sinhVien = new SinhVien();
        for (int i = 1; i <= n; i++) {
            System.out.println("Thông tin sinh viên thứ " + i + " :");
            sinhVien.nhap();

        }
        for (int i = 1; i <= n; i++) {
            System.out.println("Thông tin đầy đủ của sinh viên thứ: " + i + ": ");
            sinhVien.inTT();
        }
    }

}
