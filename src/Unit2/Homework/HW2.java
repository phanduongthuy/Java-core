/*
Viết chương trình nhập vào 3 giá trị M, N, K (M >=N) 
và thực hiện tính tổng các số chia hết cho K trong khoảng từ N đến M.
 */
package Unit2.Homework;

import java.util.Scanner;

public class HW2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long M,N,K,S=0;
        do {
            System.out.print("M = ");
            M = sc.nextLong();
            System.out.print("N = ");
            N = sc.nextLong();

        } while (N > M);
        System.out.print("K = ");
        K =sc.nextLong();
        for (long i = (long) N; i <= M; i++) {
            if( i%K==0){
                S=S+i;
            }
        }
        System.out.println("Tổng các số chia hết cho K trong khoảng từ N đến M: "+S);;
    }

}
