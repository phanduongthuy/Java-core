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
public class ex3 {
    public static void main(String[] args) {
        int day;
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi ban nhap thu bang so: ");
        day = sc.nextInt();
        switch (day) {
            case 2:
                System.out.println("Hom nay la thu hai.");
                break;
            case 3:
                System.out.println("Hom nay la thu ba.");
                break;
            case 4:
                System.out.println("Hom nay la thu tu.");
                break;
            case 5:
                System.out.println("Hom nay la thu nam.");
                break;
            case 6:
                System.out.println("Hom nay la thu sau.");
                break;
            case 7:
                System.out.println("Hom nay la thu bay.");
                break;
            default:
                System.out.println("Hom nay la chu nhat");
                break;
        }
    }
}

