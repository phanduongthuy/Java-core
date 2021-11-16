package Unit4;

public class mainApp {

    public static void main(String[] args) {
//        Khởi tạo đối tượng
        Xe bmw_x5 = new Xe();
//        Gán gí trị cho thuộc tính
//        bmw_x5.tenXe = "BMW X5";
        bmw_x5.hangXe = "BMW";
        bmw_x5.soCho = 5;

        bmw_x5.setTenxe("BMW X5");
        bmw_x5.inTT();
        bmw_x5.ChoNguoi();
    }
}
