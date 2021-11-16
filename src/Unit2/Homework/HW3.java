/*
 Viết chương trình nhập vào N số nguyên, đếm xem có bao nhiêu số nguyên âm, 
bao nhiêu số nguyên dương và bao nhiêu số 0 trong danh sách các số vừa nhập vào.
 */
package Unit2.Homework;

import java.util.Scanner;


public class HW3 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int am=0;
        int duong=0;
        int soKhong=0;
        System.out.print("So cac so nguyen ban muon nhap: ");
        int n =sc.nextInt();
        for (int i = 1; i <=n; i++) {
            System.out.print("So thu "+i+" : ");
            int m = sc.nextInt();
            if (m<0){
               am=am+1; 
            }else if(m>0){
                duong=duong+1;
            }else{
                soKhong=soKhong+1;
            }
        }
        System.out.println("Co "+am+" so nguyen am.");
        System.out.println("Co "+duong+" so nguyen duong.");
        System.out.println("Co "+soKhong+" so khong.");
    }
   
        

}
