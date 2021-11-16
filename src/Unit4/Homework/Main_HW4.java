/*
 Tạo 2 đối tượng học sinh a và học sinh b, 
giá trị của các thuộc tính của 2 đối tượng được nhập từ bàn phím. 
So sánh điểm trung bình giữa 2 đối tượng tìm ra người có điểm cao hơn 
sau đó in ra màn hình.
 */
package Unit4.Homework;

public class Main_HW4 {

    public static void main(String[] args) {
        Class_HW4 hocSinh_a = new Class_HW4();
        Class_HW4 hocSinh_b = new Class_HW4();
        hocSinh_a.nhap();
        hocSinh_b.nhap();
        if (hocSinh_a.getDiemTB() > hocSinh_b.getDiemTB()) {
            hocSinh_a.inTT();
        } else if (hocSinh_a.getDiemTB() < hocSinh_b.getDiemTB()) {

            hocSinh_b.inTT();
        } else {
            System.out.println("Hai học sinh có điểm trung bình bằng nhau.");
        }
    }
}
