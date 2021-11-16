/*
Sử dụng vòng lặp để vẽ hình sau:
 */
package Unit3.Homework;

public class HW10 {

    public static void main(String[] args) {
        int a[][] = new int[7][7];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (i <= j) {
                    System.out.print("#" + "\t");
                }
            }
            System.out.println("\n");
        }
    }
}
