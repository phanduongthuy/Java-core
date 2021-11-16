/*
Viết chương trình kiểm tra một chuỗi nhập vào có phải là palindrome hay không?
 */
package Unit6.Homework;

import java.util.Scanner;

public class HW5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhập chuỗi: ");
        String chuoi = sc.nextLine();
        for (int i = 0; i < chuoi.length(); i++) {
            if (chuoi.charAt(i) == chuoi.charAt(chuoi.length() - 1 - i)) {
                System.out.println("Chuỗi bạn nhập là palindrome.");
                break;
            } else {
                System.out.println("Chuỗi bạn nhập không phải là palindrome.");
                break;
            }
        }
    }
}
