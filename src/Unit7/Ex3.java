/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unit7;

/**
 *
 * @author admin
 */
public class Ex3 {

    public static void main(String[] args) {
        try {
            System.out.println("Start");
            int a = 10;
            int b = 0;
            System.out.println(" a / b = " + (a / b));

        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Final");
        }
        System.out.println("End.");
    }
}
