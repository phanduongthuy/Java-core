/*
Sử dụng vòng lặp để vẽ hình sau:
 */
package Unit3.Homework;

public class HW9 {

    public static void main(String[] args) {
        int a[][] = new int[5][5];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (i >= j) {
                    System.out.print("#" + "\t");
                }
            }
            System.out.println("\n");
        }
    }
}
