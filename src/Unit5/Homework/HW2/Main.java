/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unit5.Homework.HW2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhập thông tin của xe nội thành: ");
        int n, k;
        ChuyenXeNoiThanh[] xeNoiThanh;
        do {
            System.out.print("Số lượng xe nội thành: ");
            n = sc.nextInt();
        } while (n < 0);
        xeNoiThanh = new ChuyenXeNoiThanh[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Xe thứ " + (i + 1) + ": ");
            xeNoiThanh[i] = new ChuyenXeNoiThanh();
            xeNoiThanh[i].nhapTT();
        }

        System.out.println("******========******");

        System.out.println("Mời bạn nhập thông tin của xe ngoại thành: ");
        ChuyenXeNgoaiThanh[] xeNgoaiThanh;
        do {
            System.out.print("Số lượng xe ngoại thành: ");
            k = sc.nextInt();
        } while (k < 0);
        xeNgoaiThanh = new ChuyenXeNgoaiThanh[k];
        for (int i = 0; i < k; i++) {
            System.out.println("Xe thứ " + (i + 1) + ": ");
            xeNgoaiThanh[i] = new ChuyenXeNgoaiThanh();
            xeNgoaiThanh[i].nhapTT();
        }

        System.out.println("________Thông tin chuyến xe nội thành________");
        for (int i = 0; i < n; i++) {
            xeNoiThanh[i].inTT();
        }
        System.out.println("________Thông tin chuyến xe ngoại thành________");
        for (int i = 0; i < k; i++) {
            xeNgoaiThanh[i].inTT();
        }
        System.out.println("******========******");
        long DTxeNoiThanh = 0;
        for (int i = 0; i < n; i++) {
            DTxeNoiThanh += xeNoiThanh[i].getDoanhThu();
        }
        long DTxeNgoaiThanh = 0;
        for (int i = 0; i < k; i++) {
            DTxeNgoaiThanh += xeNgoaiThanh[i].getDoanhThu();
        }
        System.out.println("Tổng doanh thu của xe nội thành là " + DTxeNoiThanh);
        System.out.println("Tổng doanh thu của xe nội thành là " + DTxeNgoaiThanh);
    }
}
