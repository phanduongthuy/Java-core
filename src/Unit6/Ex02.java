/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unit6;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex02 {

    public static void main(String[] args) {
        Date dt = new Date();

        System.out.println(dt);
        
        SimpleDateFormat ft = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        
        System.out.println("Date: " + ft.format(dt));
    }
}
