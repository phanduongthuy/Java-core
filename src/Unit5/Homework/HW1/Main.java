/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unit5.Homework.HW1;

public class Main {

    public static void main(String[] args) {

        Chim chim = new Chim();
        Ca ca = new Ca();
        MayBay mayBay = new MayBay();
        Thuyen thuyen = new Thuyen();
        chim.nhapTT();
        ca.nhapTT();
        mayBay.nhapTT();
        thuyen.nhapTT();
        System.out.println();
        chim.inTT();
        chim.bay();
        chim.chay();

        ca.inTT();
        ca.boi();

        mayBay.inTT();
        mayBay.bay();

        thuyen.inTT();
        thuyen.boi();

    }
}
