/*
 In ra bảng cửu chương sử dụng vòng lặp for
 */
package Unit2.Homework;

public class HW6 {

    public static void main(String[] args) {
        System.out.println("Bảng cửu chương");
        for (int i = 1; i <= 10; i++) {
            System.out.println();
            for (int j = 2; j <= 9; j++) {
                System.out.print(j + " x " + i + " = " + j * i + "\t");
            }

        }

    }

}
