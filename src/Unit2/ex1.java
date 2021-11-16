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
public class ex1 {
    public static void main(String[] args) {
        int numb;
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhập số nguyên bất kì: ");
        numb = sc.nextInt();
        if (numb%2==0){
            System.out.println(numb + " La so chan");
        }else{
            System.out.println(numb + " La so le");
        }
    }
   
}
