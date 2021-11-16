/*
Sử dụng vòng lặp vẽ hình sau: 
 */
package Unit3.Homework;

public class HW15 {

    public static void main(String[] args) {
        int i, j;
        int a[][] = new int[7][7];
        for (i = 0; i < a.length; i++) {
            for (j = 0; j < a[i].length; j++) {
                if (i == 0 || i == a.length - 1 || j == i || j == a.length - 1 - i) {
                    System.out.print(" # ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}
