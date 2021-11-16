/*
 Sử dụng vòng lặp để vẽ hình sau:
 */
package Unit3.Homework;

public class HW13 {

    public static void main(String[] args) {
        int i, j;
        int a[][] = new int[6][6];
        for (i = 0; i < a.length; i++) {
            for (j = 0; j < a[i].length; j++) {
                if (i == 0 || j == 0|| i == a.length - 1  || j == a[i].length - 1) {
                    System.out.print(" # ");
                }else{
                    System.out.print("   ");
                }
            }        
        System.out.println();
        }
    }
}
