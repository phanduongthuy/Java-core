/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unit6.Homework;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class HW3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhập chuỗi: ");
        double chuoi = sc.nextDouble();
//        int a = Integer.parseInt(chuoi);
//        System.out.println("Format String về dạng tiền tệ ngăn cách nhau bởi dấu " + ", : ");
//        System.out.format("%,8d%n", a);
        NumberFormat number = NumberFormat.getInstance(Locale.US);
        System.out.println("Format String về dạng tiền tệ ngăn cách nhau bởi dấu " + ", : ");
        String formatString = number.format(chuoi);

        System.out.println(formatString);
    }

}
