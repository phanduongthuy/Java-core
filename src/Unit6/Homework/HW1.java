/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unit6.Homework;

import java.util.Scanner;

public class HW1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhập chuỗi họ tên: ");
        String name = sc.nextLine();
        String[] arr_name = name.split(" ");
        System.out.println("Họ, tên đệm và tên sau khi được tách: ");
        System.out.println("Họ: " + arr_name[0]);

        String dem = "";
        for (int i = 0; i < arr_name.length; i++) {
            if (i != 0 && i != arr_name.length - 1) {
                dem += arr_name[i];
            }
        }
        System.out.println("Đệm: " + dem);
        System.out.println("Tên: " + arr_name[arr_name.length - 1]);
    }
}
