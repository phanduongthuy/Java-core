package Unit4;

public class Xe {
// Thuộc tính

    private String tenXe;
    String hangXe;
    int soCho;

    public String getTenxe() {
        return this.tenXe;
    }

    public String setTenxe(String tenXe) {
        return this.tenXe = tenXe;
    }
// Phương thức

    public void ChoNguoi() {
        System.out.println("Xe chở người.");

    }

    public void inTT() {
//  In thông tin
        System.out.println("Thông tin xe muốn mua: ");
        System.out.println("Tên xe: " + this.getTenxe());
        System.out.println("Hãng xe: " + this.hangXe);
        System.out.println("Số chỗ: " + this.soCho);

    }
}
