/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unit5.Homework.HW1;

import java.util.Scanner;

public class Chim extends DongVat implements iBay, iChay, iThongTin {

    @Override
    public void nhapTT() {
        System.out.println("************* Nhập thông tin của chim *************");
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
        System.out.println("************* In thông tin của chim *************");
        System.out.println("Tên chim là: " + this.getTen());
        System.out.println("Thuộc loài: " + this.getLoai());
        System.out.println("Giống chim: " + this.getGioiTinh());
        System.out.println("Lông chim màu: " + this.getMauSac());
        System.out.println("Môi trường sống: " + this.getMoiTruongSong());
    }

    @Override
    public void bay() {
        System.out.println("Chim biết bay.");
    }

    @Override
    public void chay() {
        System.out.println("Chim biết chạy.");
    }

}
