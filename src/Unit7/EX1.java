/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unit7;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/**
 *
 * @author admin
 */
public class EX1 {

    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add("Thuy");
        al.add(0, "Trung");   //add vào index 0.
        al.add("Tuyen");
        al.add(1, "Tu");
        System.out.println(al);  //in toàn bộ arrayList.

        // Phương thức get -> Lấy ra giá tri tại index i
        System.out.println(al.get(0));

        System.out.println(al.contains("Thuy"));  //Kiểm tra có hay không phần tử truyền vào.

        System.out.println(al.indexOf("Thuy"));  //Trả về vị trí của đối tượng truyền vào trong list nếu có. Ngược lại sẽ = -1

        System.out.println(al.lastIndexOf("Tu")); // Trả về vị trí cuối cùng của đối tượng truyền vào.

        System.out.println(al.remove("Trung"));  // Xóa đối tượng truyền vào trong list.
        System.out.println(al);

        System.out.println(al.size());  // trả về độ dài của list.

        al.set(2, "Phan Thùy");  // Ghi đè đối tượng truyền vào vào vị trí i.
        System.out.println(al);

        Collections.sort(al);  //Sắp xếp list.
        System.out.println(al);

        //In toàn bộ mảng
        for (int i = 0; i < al.size(); i++) {
            System.out.println(al.get(i));
        }

        for (Object item : al) {
            System.out.println(item);
        }

        // Xóa toàn bộ phần tử trong list
        al.clear();
        System.out.println(al);

    }

}
