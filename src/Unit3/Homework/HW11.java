/*
 Sử dụng vòng lặp để vẽ hình sau:
 */
package Unit3.Homework;

public class HW11 {
   public static void main(String[] args) {
        int i,j;
        int a[][] = new int[8][8];
        for ( i = 0; i < a.length; i++) {
            for ( j = 0; j < a[i].length; j++) {
                if (i <= j) {
                    System.out.print("#" + "\t");
                } else {
                    System.out.print("\t");
                }
            }
            System.out.println("\n");
        }
    } 
}
