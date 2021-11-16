/*
 *Viết chương  trình đếm và  in  ra số  lượng các số nguyên chia hết cho 3 hoặc 7 nằm trong đoạn 1 đến 100.
 */
package Unit2.Homework;

public class HW7 {

    public static void main(String[] args) {
        int dem = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 || i % 7 == 0) {
                dem+=1;
            }

        }
        System.out.println("Số lượng các số nguyên chia hết cho 3 hoặc 7 trong đoạn 1 đến 100 la: " + dem);
    }

}
