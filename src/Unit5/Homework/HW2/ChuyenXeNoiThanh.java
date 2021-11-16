/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unit5.Homework.HW2;

import java.util.Scanner;

public class ChuyenXeNoiThanh extends Xe implements iThongTin {

    private String soTuyen;
    private float soKmDiDuoc;

    @Override
    public void nhapTT() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập mã số chuyến: ");
        this.setMaSoChuyen(sc.nextLine());
        System.out.println("Nhập họ tên tài xế: ");
        this.setHoTenTaiXe(sc.nextLine());
        System.out.println("Nhập số xe: ");
        this.setSoXe(sc.nextLine());
        System.out.println("Nhập số tuyến: ");
        this.soTuyen = sc.nextLine();
        System.out.println("Nhập số Km đi được: ");
        this.soKmDiDuoc = sc.nextFloat();
        System.out.println("Nhập doanh thu: ");
        this.setDoanhThu(sc.nextLong());

    }

    @Override
    public void inTT() {
        System.out.println("Chuyến xe có mã số: " + this.getMaSoChuyen());
        System.out.println("Họ tên tài xế: " + this.getHoTenTaiXe());
        System.out.println("Số xe: " + this.getSoXe());
        System.out.println("Số tuyến: " + this.soTuyen);
        System.out.println("Số Km đi được: " + this.soKmDiDuoc);
        System.out.println("Doanh thu: " + this.getDoanhThu());
    }

}
