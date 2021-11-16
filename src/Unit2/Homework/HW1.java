/*
 Nhập vào N số nguyên dương, tính tổng các số chia hết cho 4 
hoặc có chữ số ở hàng trăm là 3
 */
package Unit2.Homework;

import java.util.Scanner;

public class HW1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int S = 0;
        System.out.print("So cac so nguyen duong ban muon nhap: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.print("So thu " + i + " : ");
            int j = sc.nextInt();
            if (j % 4 == 0 || (j % 1000) / 100 == 3) {
                S = S + j;
            }
        }
        System.out.println("Tổng các số chia hết cho 4 \n"
                + "hoặc có chữ số ở hàng trăm là 3 là: " + S);

    }

}
