/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unit2;

/**
 *
 * @author ADMIN
 */
public class ex5 {

    public static void main(String[] args) {
        int s1 = 0;
        for (int i = 1; i <= 10; i++) {
            s1 = s1 + i;
        }
        System.out.println("Tong 10 so tu nhien 1+2+3+...+10 = " + s1);
        int s2 = 0;
        for (int i = 1; i <= 99; i++) {
            if (i % 2 != 0) {
                s2 = s2 + i;
            }
        }
        System.out.println("Tong 1+3+5+...+99 = " + s2);
        int s3 = 0;
        for (int i = 2; i <= 10; i++) {
            if (i % 2 == 0) {
                s3 = s3 + i * i;
            }           
        }
        System.out.println("Tong s2 = " + s3);
        float s4 = 0;
        for (int i = 1; i <= 100; i++) {
            s4 = s4 + 1 / i;
        }
        System.out.println("Tong s4 = " + s4);
    }
}
