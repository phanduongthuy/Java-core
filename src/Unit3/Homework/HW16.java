/*
Sử dụng vòng lặp để vẽ hình sau:
 */
package Unit3.Homework;

public class HW16 {

    public static void main(String[] args) {
        int a[][] = new int[10][10];
        for (int i = 1; i < a.length; i++) {
            for (int j = 1; j < a[i].length; j++) {
                if (i >= j) {
                    System.out.print(j + "\t");
                }
            }
            System.out.println("\n");
        }
    }
}
