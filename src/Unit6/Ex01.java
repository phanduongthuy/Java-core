/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unit6;

public class Ex01 {

    public static void main(String[] args) {
        String a = "10";
        int numb = Integer.parseInt(a);

        String s = "Zent BKA Zent";

        System.out.println(s.indexOf("t")); // Tìm index của "t" đầu tiên.
        System.out.println(s.charAt(3));    // Tìm ký tự tại index 3 ==> Trả về "t".
        System.out.println(s.lastIndexOf("t")); // Tìm index của "t" cuối cùng.
        System.out.println(s.length()); // độ dài chuỗi ==> 13.
        System.out.println(s.replace("t", "T"));    //Thay thế toàn bộ "t" thành "T".
        System.out.println(s.replace("n", "N"));    //thay thế toàn bộ "n" thành "N".

        System.out.println(s.startsWith("Zent"));   //Kiểm tả chuỗi có bứt đầu bằng chuỗi truyền vào không?
        System.out.println(s.substring(5)); //Lấy start index.
        System.out.println(s.substring(5, 8));  //Lấy start index = 5 vè end index = 8.
        System.out.println(s.toLowerCase());    //Viết tất cả thường.
        System.out.println(s.toUpperCase());    //Viết tất cả hoa.
        System.out.println(s.trim());
        System.out.println(s.contains("BKA"));  //Kiểm tra chứa.
        System.out.println(s.equals("Zent BKA Zent"));  //So sánh bằng.
        System.out.println(s.isEmpty());

        String[] arr = s.split("BKA");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }
        String name = "Phan Dương Thùy";
        String[] arr_name = name.split(" ");
        System.out.println("Họ: " + arr_name[0]);
        System.out.println("Tên: " + arr_name[arr_name.length - 1]);
        String dem = "";
        for (int i = 0; i < arr_name.length; i++) {
            if (i != 0 && i != arr_name.length - 1) {
                dem += arr_name[i];
            }
        }
        System.out.println("Đệm: " + dem);
    }
}
