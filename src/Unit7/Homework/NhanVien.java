/*
-) Lớp nhân viên bao gồm:
-) Thuộc tính : ID, Họ và tên, số điện thoại, email, giới tính, năm sinh, quê quán. Các thuộc tính để chế độ private.
-) Phương thức: get, set, 02 constructor.
-) Phương thức: Thêm mới nhân viên, Hiển thị thông tin nhân viên, toString() trả về ID-Họ và tên nhân viên-Năm sinh
 */
package Unit7.Homework;

import java.util.Scanner;

public class NhanVien {

    private String iD, hoVaTen, soDienThoai, email, gioiTinh, queQuan, namSinh;


//Phương thức get, set : 
    public String getiD() {
        return iD;
    }

    public void setiD(String iD) {
        this.iD = iD;
    }

    public String getHoVaTen() {
        return hoVaTen;
    }

    public void setHoVaTen(String hoVaTen) {
        this.hoVaTen = hoVaTen;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getQueQuan() {
        return queQuan;
    }

    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }

    public String getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(String namSinh) {
        this.namSinh = namSinh;
    }
//Phương thức Constructor: 

    public NhanVien() {
    }

    public NhanVien(String iD, String hoVaTen, String soDienThoai, String email, String gioiTinh, String queQuan, String namSinh) {
        this.iD = iD;
        this.hoVaTen = hoVaTen;
        this.soDienThoai = soDienThoai;
        this.email = email;
        this.gioiTinh = gioiTinh;
        this.queQuan = queQuan;
        this.namSinh = namSinh;
    }

//    Phương thức thêm nhân viên
    public void themNV() {
        Scanner sc = new Scanner(System.in);
        System.out.println("ID của nhân viên: ");
        this.iD = sc.nextLine();
        System.out.println("Họ tên của nhân viên: ");
        this.hoVaTen = sc.nextLine();
        System.out.println("Số điện thoại của nhân viên: ");
        this.soDienThoai = sc.nextLine();
        System.out.println("Email của nhân viên: ");
        this.email = sc.nextLine();
        System.out.println("Giới tính của nhân viên: ");
        this.gioiTinh = sc.nextLine();
        System.out.println("Quê quán của nhân viên: ");
        this.queQuan = sc.nextLine();
        System.out.println("Năm sinh của nhân viên: ");
        this.namSinh = sc.nextLine();

    }

//    Phương thức hiển thịt thông tin
    public void hienThiTT() {
        System.out.println("ID : " + this.getiD());
        System.out.println("Họ tên : " + this.getHoVaTen());
        System.out.println("Số điện thoại : " + this.getSoDienThoai());
        System.out.println("Email : " + this.getEmail());
        System.out.println("Giới tính : " + this.getGioiTinh());
        System.out.println("Quê quán : " + this.getQueQuan());
        System.out.println("Năm sinh n: " + this.getNamSinh());

    }
    public void in(){
        System.out.println(toString());
    }
    @Override
    public String toString() {
        return "ID: " + this.getiD() + ", Họ và tên: " + this.getHoVaTen() + ", Năm sinh: " + this.getNamSinh();
    }

    
}