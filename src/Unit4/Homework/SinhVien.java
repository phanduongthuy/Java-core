/*
  Thiết kế lớp Sinh viên bao gồm 
- Các thuộc tính cần thiết như: họ tên, lớp... ( ít nhất 10 thuộc tính)
- Viết ít nhất 5 Constructor với các tham số đầu vào khác nhau.
- Viết các phương thức getter, setter cho các thuộc tính
- Viết phương thức nhập vào thông tin sinh viên.
- Viết phương thức hiển thị đầy đủ thông tin sinh viên.
 */
package Unit4.Homework;

import java.util.Scanner;

public class SinhVien {

    private String hoTen, ngaySinh, gioiTinh, diaChi, soDT, lop, nganh;

    private float diemTB;
    private int maSV, soTinNo;
//   Constructor

    public SinhVien() {
        System.out.println();
    }

    public SinhVien(String lop) {
        this.lop = lop;

    }

//    Constructor 2
    public SinhVien(int maSV, int soTinNo) {
        this.maSV = maSV;
        this.soTinNo = soTinNo;
    }
//     Constructor 3

    public SinhVien(int maSV, String hoTen, String ngaySinh, String gioiTinh, float diemTB) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.diemTB = diemTB;
    }
//     Constructor 4

    public SinhVien(int maSV, String hoTen, String ngaySinh, String gioiTinh, String diaChi) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;

    }
//     Constructor 5

    public SinhVien(int maSV, String hoTen, String ngaySinh, String gioiTinh, String diaChi, String lop, String nganh, float diemTB, int soTinNo) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
        this.lop = lop;
        this.nganh = nganh;
        this.diemTB = diemTB;
        this.soTinNo = soTinNo;
    }

//Các phương thức getter, setter cho các thuộc tính
    public int getMaSV() {
        return this.maSV;
    }

    public void setMaSV(int maSV) {
        this.maSV = maSV;
    }

    public String getHoTen() {
        return this.hoTen;
    }

    public void setHoten(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getNgaySinh() {
        return this.ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getGioiTinh() {
        return this.gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getDiaChi() {
        return this.diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getSoDT() {
        return this.soDT;
    }

    public void setSoDT(String soDT) {

        this.soDT = soDT;
    }

    public String getLop() {
        return this.lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public String getNganh() {
        return this.nganh;
    }

    public void setNganh(String nganh) {
        this.nganh = nganh;
    }

    public float getDiemTB() {
        return this.diemTB;
    }

    public void setDiemTB(float diemTB) {
        this.diemTB = diemTB;
    }

    public int getSoTinNo() {
        return this.soTinNo;
    }

    public void setSoTinNo(int soTinNo) {
        this.soTinNo = soTinNo;
    }

//Phương thức nhập vào thông tin sinh viên.
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mã sinh viên: ");
        this.maSV = sc.nextInt();
        sc.nextLine();
        System.out.println("Họ và tên: ");
        this.hoTen = sc.nextLine();
        System.out.println("Ngày sinh: ");
        this.ngaySinh = sc.nextLine();
        System.out.println("Giới tính: ");
        this.gioiTinh = sc.nextLine();
        System.out.println("Địa chỉ: ");
        this.diaChi = sc.nextLine();
        System.out.println("Số điện thoại: ");
        this.soDT = sc.nextLine();
        System.out.println("Lớp: ");
        this.lop = sc.nextLine();
        System.out.println("Ngành: ");
        this.nganh = sc.nextLine();
        System.out.println("Điểm trung bình: ");
        this.diemTB = sc.nextFloat();
        System.out.println("Số tín chỉ còn nợ: ");
        this.soTinNo = sc.nextInt();

    }

//  Phương thức hiển thị đầy đủ thông tin sinh viên.     
    public void inTT() {
        System.out.println("Mã sinh viên: " + this.getMaSV());
        System.out.println("Họ và tên: " + this.getHoTen());
        System.out.println("Ngày sinh: " + this.getNgaySinh());
        System.out.println("Giới tính: " + this.getGioiTinh());
        System.out.println("Địa chỉ: " + this.getDiaChi());
        System.out.println("Số điện thoại: " + this.getSoDT());
        System.out.println("Lớp: " + this.getLop());
        System.out.println("Ngành: " + this.getNganh());
        System.out.println("Điểm trung bình: " + this.getDiemTB());
        System.out.println("Số tín chỉ còn nợ: " + this.getSoTinNo());
        if (this.getDiemTB() >= 8 && this.getDiemTB() <= 10) {
            System.out.println("Học lực giỏi.");
        } else if (this.getDiemTB() >= 6.5 && this.getDiemTB() < 8) {
            System.out.println("Học lực khá.");
        } else if (this.getDiemTB() >= 5.0 && this.getDiemTB() < 6.5) {
            System.out.println("Học lực trung bình.");
        } else if (this.getDiemTB() >= 0.0 && this.getDiemTB() < 5) {
            System.out.println("Học lực yếu.");
        } else {
            System.out.println("Nhập sai");
        }

    }
}
