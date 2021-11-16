/*
 ----------------------QL Nhân Viên--------------------------------
1- Xem danh sách nhân viên
2- Thêm mới 1 nhân viên
3- Xóa 1 nhân viên truyền vào mã nhân viên
4- Chỉnh sửa 1 nhân viên truyền vào mã nhân viên
5- Tìm kiếm nhân viên dựa vào mã nhân viên/email/sdt
6- Thoát
Dữ liệu được lưu vào file text. Sử dụng kết hợp arraylist
 */
package Unit7.Homework;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Scanner;



public class Manager {
    
    static ArrayList<NhanVien> listNV = new ArrayList<>();
    
    public static void hienThiTT() {
        docFile();
        for (NhanVien item : listNV) {
            item.in();
        }
    }
    
    public static void themNV() {
        
        NhanVien nhanVien = new NhanVien();
        nhanVien.themNV();
        listNV.add(nhanVien);
        
    }
    
    public static void xoaNV() {
        
        Scanner sc = new Scanner(System.in);
        
        NhanVien nhanVien;
        
        do {
            System.out.println("Nhập vào id muốn xóa : ");
            String ma = sc.nextLine();
            nhanVien = timNV(ma);
            if (nhanVien == null) {
                System.out.println("Tìm rồi không thấy đâu. Nhập lại đi:  ");
            }
        } while (nhanVien == null);
        if (nhanVien != null) {
            listNV.remove(nhanVien);
        }
        
    }
    
    public static void suaNV() {
        NhanVien nhanVien;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Nhập vào id muốn sửa : ");
            
            String ma = sc.nextLine();
            nhanVien = timNV(ma);
            if (nhanVien == null) {
                System.out.println("Không có mã đâu .. mời nhập lại:");
            }
            
        } while (nhanVien == null);
        if (nhanVien != null) {
            System.out.println("Nhập ID mới :");
            nhanVien.setiD(sc.nextLine());
            System.out.println("Nhập Ho tên mới : ");
            nhanVien.setHoVaTen(sc.nextLine());
            System.out.println("Nhập SDT mới : ");
            nhanVien.setSoDienThoai(sc.nextLine());
            System.out.println("Nhập Email mới : ");
            nhanVien.setEmail(sc.nextLine());
            System.out.println("Nhập năm Sinh mới : ");
            nhanVien.setNamSinh(sc.nextLine());
            System.out.println("Nhập GT : ");
            nhanVien.setGioiTinh(sc.nextLine());
            System.out.println("Nhập quê quán: ");
            nhanVien.setQueQuan(sc.nextLine());
            
        }
        
    }
    
    public static NhanVien timNV(String ma) {
        for (NhanVien item : listNV) {
            if (ma.equals(item.getiD())) {
                return item;
                
            }
        }
        return new NhanVien();
    }
    
    public static ArrayList<NhanVien> timKiem() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào thông tin muốn tìm kiếm : ");
        //Tạo thêm 1 ArrayList để chứa những ông tìm kiếm vào
        ArrayList<NhanVien> listTK = new ArrayList<>();
        String tuKhoa = sc.nextLine();
        for (NhanVien item : listNV) {
            if (tuKhoa.contains(item.getSoDienThoai()) || tuKhoa.contains(item.getiD()) || tuKhoa.contains(item.getEmail())) {
                listTK.add(item);
                for (NhanVien nhanVien : listTK) {
                    nhanVien.hienThiTT();
                }
            } else {
                System.out.println("Không tìm thấy người phù hơp ");
            }
        }
        return new ArrayList<>();
    }
    
    public static void ghiFile() {
        try {
            String data = "";
            for (int i = 0; i < listNV.size(); i++) {
                data += listNV.get(i).getiD() + "\t";
                data += listNV.get(i).getHoVaTen() + "\t";
                data += listNV.get(i).getSoDienThoai() + "\t";
                data += listNV.get(i).getEmail() + "\t";
                data += listNV.get(i).getGioiTinh() + "\t";
                data += listNV.get(i).getQueQuan() + "\t";
                data += listNV.get(i).getNamSinh() + "\t";
            }
            Writer wr = null;
            // Ghi dữ liệu dạng text vào file
            wr = new FileWriter("NhanVien.txt");
            
            BufferedWriter bw = new BufferedWriter(wr);
            
            bw.write(data);
            bw.close();
        } catch (Exception e) {
        }
        
    }
    
    public static void docFile() {
        try {
            FileReader fr;
            fr = new FileReader("NhanVien.txt");
            BufferedReader br = new BufferedReader(fr);
            listNV = new ArrayList<>();
            String info = null;
            try {
                while ((info = br.readLine()) != null) {
                    String chiaTT[] = info.split("\t");
                    NhanVien nhanVien = new NhanVien();
                    if (chiaTT.length == 1) {
                        return;
                        
                    }
                    nhanVien.setiD(chiaTT[0]);
                    nhanVien.setHoVaTen(chiaTT[1]);
                    nhanVien.setSoDienThoai(chiaTT[2]);
                    nhanVien.setEmail(chiaTT[3]);
                    nhanVien.setGioiTinh(chiaTT[4]);
                    nhanVien.setQueQuan(chiaTT[5]);
                    nhanVien.setNamSinh(chiaTT[6]);
                    listNV.add(nhanVien);
                    br.close();
                }
            } catch (Exception e) {
            }
            
        } catch (Exception e) {
        }
    }
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Nhập vào số lượng nhân viên cần nhập : ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            NhanVien nhanVien = new NhanVien();
            nhanVien.themNV();
            listNV.add(nhanVien);
        }
        
        int a;
        do {
            System.out.println("----------------------QL Nhân Viên--------------------------------");
            System.out.println("\t1- Xem danh sách nhân viên");
            System.out.println("\t2- Thêm mới 1 nhân viên");
            System.out.println("\t3- Xóa 1 nhân viên truyền vào mã nhân viên");
            System.out.println("\t4- Chỉnh sửa 1 nhân viên truyền vào mã nhân viên");
            System.out.println("\t5- Tìm kiếm nhân viên dựa vào mã nhân viên/email/sdt");
            System.out.println("\t6- Thoát");
            System.out.println("<<<<<-------------------->>>>>");
            System.out.println("Mời bạn lựa chọn công việc: ");
            a = sc.nextInt();
            
            switch (a) {
                case 1:
                   
                    hienThiTT();
                    
                    break;
                case 2:
                    themNV();
                    docFile();
                    break;
                case 3:
                    xoaNV();
                    docFile();
                    break;
                case 4:
                    suaNV();
                    docFile();
                    break;
                case 5:
                    timKiem();
                    docFile();
                    break;
                case 6:
                    
                    System.exit(0);
                    docFile();
                default:
                    System.out.println("Bạn đã chọn sai cú pháp. Mời nhập lại: ");
                    break;
            }
            
        } while (a != 6);


    }
    
}
