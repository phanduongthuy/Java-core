/*
Sử dụng vòng lặp để vẽ hình sau:
 */
package Unit3.Homework;

public class HW12 {

    public static void main(String[] args) {
        int i, j;
        int a[][] = new int[7][7];
        for (i = a.length - 1; i >= 0; i--) {
            for (j = 0; j <= a[i].length; j++) {
                if (i >= j) {
                    System.out.print("\t");
                } else {

                    System.out.print("#" + "\t");
                }
            }
            System.out.println("\n");
        }
    }
}
