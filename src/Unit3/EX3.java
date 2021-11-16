/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unit3;

/**
 *
 * @author ADMIN
 */
public class EX3 {

    public static void main(String[] args) {
//        cong2so_cothamso(10,20);
        System.out.println("in ra o ham main: " + cong2so_travegiatri(10, 20));
    }

    public static void cong2so() {
        int a = 10;
        int b = 20;
        System.out.println("a + b = " + (a + b));
    }

    public static void cong2so_cothamso(int a, int b) {
        System.out.println("a + b = " + (a + b));
    }

    public static int cong2so_travegiatri(int a, int b) {
        System.out.println("in trong ham: a+b = " + (a + b));
        return a + b;
    }

}
