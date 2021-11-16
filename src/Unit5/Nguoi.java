/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unit5;

/**
 *
 * @author admin
 */
public class Nguoi {

    String ten;
    String gioiTinh;
    int tuoi;

    public void an() {
        System.out.println(" Phuong thuc an.");
    }

}

class SinhVien extends Nguoi {

    public int Cong(int a, int b) {
        return a + b;

    }

    public String Cong(String a, String b) {
        return a + b;

    }
//    @Override
//     public void an() {
//        System.out.println(" Phuong thuc an nhe.");
//    }
}

class Main {

    public static void main(String[] args) {
        SinhVien sv1 = new SinhVien();
        sv1.an();
        System.out.println(sv1.Cong("10", "20"));
    }
}
