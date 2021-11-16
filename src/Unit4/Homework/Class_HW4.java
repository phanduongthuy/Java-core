/*
Tạo class HocSinh gồm 3 thuộc tính: Họ tên, lớp, điểm trung bình.
 */
package Unit4.Homework;

import java.util.Scanner;

public class Class_HW4 {

    private String hoTen, lop;
    private float diemTB;

    public String getHoTen() {
        return this.hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getLop() {
        return this.lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public float getDiemTB() {
        return this.diemTB;
    }

    public void setDiemTB(float diemTB) {
        this.diemTB = diemTB;
    }

    public Class_HW4() {

    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhập các thông tin: ");
        System.out.print("Họ và tên: ");
        this.hoTen = sc.nextLine();
        System.out.println();
        System.out.print("Lớp: ");
        this.lop = sc.nextLine();
        System.out.println();
        System.out.print("Điểm trung bình: ");
        this.diemTB = sc.nextFloat();
    }

    public void inTT() {
        System.out.println("Thông tin đối tượng: ");
        System.out.print("Họ tên: " + this.getHoTen());
        System.out.println();
        System.out.println("Lớp: " + this.getLop());
        System.out.println();
        System.out.println("Điểm trung bình: " + this.getDiemTB());
    }
}
