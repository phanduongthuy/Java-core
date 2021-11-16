/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unit6.Homework;

import java.util.Scanner;

public class HW6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhập chuỗi: ");
        String chuoi = sc.nextLine();
        System.out.println("Ký tự đầu tiên của chuỗi: " + chuoi.charAt(0));
        System.out.println("Ký tự cuối cùng của chuỗi: " + chuoi.charAt(chuoi.length() - 1));
    }

}
