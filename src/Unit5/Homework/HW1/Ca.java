/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unit5.Homework.HW1;

import java.util.Scanner;

public class Ca extends DongVat implements iBoi, iThongTin {

    @Override
    public void nhapTT() {
        System.out.println("************* Nhập thông tin của cá *************");
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên: ");
        this.setTen(sc.nextLine());
        System.out.println("Nhập loài: ");
        this.setLoai(sc.nextLine());
        System.out.println("Nhập giới tính: ");
        this.setGioiTinh(sc.nextLine());
        System.out.println("Nhập màu sắc: ");
        this.setMauSac(sc.nextLine());
        System.out.println("Môi trường sống: ");
        this.setMoiTruongSong(sc.nextLine());
    }

    @Override
    public void inTT() {
        System.out.println("************* In thông tin của cá *************");
        System.out.println("Cá tên là: " + this.getTen());
        System.out.println("Thuộc loài: " + this.getLoai());
        System.out.println("Giống cá: " + this.getGioiTinh());
        System.out.println("Màu cá: " + this.getMauSac());
        System.out.println("Môi trường sống: " + this.getMoiTruongSong());
    }

    @Override
    public void boi() {
        System.out.println("Cá biết bơi.");
    }

}
