/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unit5.Homework.HW1;

import java.util.Scanner;

public class Thuyen extends MayMoc implements iBoi, iThongTin {

    @Override
    public void boi() {
        System.out.println("Thuyền bơi trên nước.");
    }

    @Override
    public void nhapTT() {
        Scanner sc = new Scanner(System.in);
        System.out.println("************* Nhập thông tin của thuyền *************");
        System.out.println("Nhập tên: ");
        this.setTen(sc.nextLine());
        System.out.println("Nhập kích cỡ: ");
        this.setSize(sc.nextLine());
        System.out.println("Nhập loại: ");
        this.setLoai(sc.nextLine());
        System.out.println("Nhập hãng: ");
        this.setHang(sc.nextLine());
        System.out.println("Nhập màu sắc: ");
        this.setMauSac(sc.nextLine());
    }

    @Override
    public void inTT() {
        System.out.println("************* In thông tin của thuyền *************");
        System.out.println("Thuyền tên là: " + this.getTen());
        System.out.println("Thuyền cỡ: " + this.getSize());
        System.out.println("Thuyền loại: " + this.getLoai());
        System.out.println("Thuyền hãng: " + this.getHang());
        System.out.println("Thuyền màu: " + this.getMauSac());

    }
}
