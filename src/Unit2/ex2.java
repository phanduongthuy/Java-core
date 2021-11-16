/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unit2;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class ex2 {

    public static void main(String[] args) {
        int day;
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi ban nhap thu bang so: ");
        day = sc.nextInt();
        if (day == 2) {
            System.out.println("Hom nay la thu hai.");
        } else if (day == 3) {
            System.out.println("Hom nay la thu ba.");
        } else if (day == 4) {
            System.out.println("Hom nay la thu tu.");
        } else if (day == 5) {
            System.out.println("Hom nay la thu nam.");
        } else if (day == 6) {
            System.out.println("Hom nay la thu sau.");
        } else if (day == 7) {
            System.out.println("Hom nay la thu bay.");
        } else {
            System.out.println("Hom nay la chu nhat");
        }
    }
}
