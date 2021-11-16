package Unit1;

import java.util.Scanner;

public class HW1 {

    public static void main(String[] arge) {
        Scanner Sc = new Scanner(System.in);
        String hoTen, lop, truong, gioiTinh, ngaySinh, queQuan;
        System.out.println("Nhap ho va ten sinh vien: ");
        hoTen = Sc.nextLine();
        System.out.println("Nhap lop cua sinh vien: ");
        lop = Sc.nextLine();
        System.out.println("Nhap ten truong cua sinh vien: ");
        truong = Sc.nextLine();
        System.out.println("Nhap gioi tinh sinh vien: ");
        gioiTinh = Sc.nextLine();
        System.out.println("Nhap ngay sinh cua sinh vien: ");
        ngaySinh = Sc.nextLine();
        System.out.println("Nhap que quan cua sinh vien: ");
        queQuan = Sc.nextLine();
        System.out.println("Ho ten sinh vien: " + hoTen);
        System.out.println("Lop : " + lop);
        System.out.println("Truong : " + truong);
        System.out.println("Gioi tinh: " + gioiTinh);
        System.out.println("Ngay sinh: " + ngaySinh);
        System.out.println("Que quan: " + queQuan);

    }

}
