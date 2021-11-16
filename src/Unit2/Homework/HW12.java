/*
 Viết chương trình in ra bảng mã ASCII sử dụng vòng lặp for, while, do while.
 */
package Unit2.Homework;

public class HW12 {

    public static void main(String[] args) {
//   Sử dụng vòng lặp for   
        System.out.println("Bảng mã ASCII sử dụng vòng lặp for: ");
        for (int i = 32; i <= 126; i++) {
            System.out.println(i + " : " + (char) i);
        }
//   Sử dụng vòng lặp while   
        System.out.println("Bảng mã ASCII sử dụng vòng lặp while: ");
        int j = 32;
        while (j <= 126) {
            System.out.println(j + " : " + (char) j);
            j++;
        }
//  Sử dụng vòng lặp do ... while     
        System.out.println("Bảng mã ASCII sử dụng vòng lặp do while:");
        int k = 32;
        do {
            System.out.println((int) k + " : " + (char) k);
            k++;
        } while (k < 127);
    }
}
