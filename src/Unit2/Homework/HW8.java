/*
 Viết chương trình in ra tổng của 10 số chẵn đầu tiên.
 */
package Unit2.Homework;

public class HW8 {

    public static void main(String[] args) {
        int S = 0;
        for (int i = 0; i < 10; i++) {
            S = S + i * 2;
        }
        System.out.println("Tổng của 10 số chẵn đầu tiên la: " + S);
    }

}
