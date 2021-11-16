/*
Viết chương trình chuẩn hóa chuỗi nhập vào. Cắt bỏ các khoảng trắng đầu cuối 
hoặc trong chuỗi, viết hoa chữ cái đầu tiên của các từ trong chuỗi. 
Cuối chuỗi có dấu chấm kết thúc chuỗi.
Ví dụ:
- Chuỗi đầu vào: “ vu van thuong ”
- Chuỗi đầu ra: “Vu Van Thuong.”
 */
package Unit6.Homework;

import java.util.Scanner;

public class ChuanHoaChuoi {

    public String xoaKhoangTrong(String chuoi) {
        chuoi = chuoi.trim();
        chuoi = chuoi.replaceAll("\\s+", " ");
        return chuoi;
    }

    public String chuanHoaDanhTuRieng(String chuoi) {
        chuoi = xoaKhoangTrong(chuoi);
        String a[] = chuoi.split(" ");
        chuoi = "";
        for (int i = 0; i < a.length; i++) {
            chuoi += String.valueOf(a[i].charAt(0)).toUpperCase() + a[i].substring(1);
            if (i < a.length - 1) {
                chuoi += " ";
            }
        }
        return chuoi;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhập chuỗi: ");
        String line = sc.nextLine();
        ChuanHoaChuoi chc = new ChuanHoaChuoi();
        String s = chc.chuanHoaDanhTuRieng(line);
        System.out.println(s + ".");

    }

}
