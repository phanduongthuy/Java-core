/*
Viết một chương trình đảo ngược trật tự các ký tự trong từng từ 
của một xâu (nhập vào từ bàn phím).
Ví dụ “To Be Or Not To Be” sẽ trở thành “oT eB rO toN oT eB”.
 */
package Unit6.Homework;

import java.util.Scanner;

public class HW4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhập chuỗi: ");
        String chuoi = sc.nextLine();
//        String
        System.out.println("Đảo ngược trật tự các ký tự trong từng từ của một xâu dùng String: ");
        for (int i = chuoi.length()-1; i >= 0; i--) {
            char z = chuoi.charAt(i);
            System.out.print(z);
        }
        System.out.println();
        
//        StringBuilder
        System.out.println("Đảo ngược trật tự các ký tự trong từng từ của một xâu dùng StringBuilder:");
        StringBuilder a = new StringBuilder();
        a.append(chuoi);
        a = a.reverse();
        for (int i = 0; i < a.length(); i++) {
            System.out.print(a.charAt(i));
        }
    }
}
