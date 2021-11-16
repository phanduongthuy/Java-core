
package Unit3;

import java.util.Scanner;

public class EX {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.println("1. Di ngu.");
            System.out.println("2. Di choi.");
            System.out.println("3. Di an.");
            System.out.println("4. Di hoc.");
            System.out.print("Nhap vao lua chon cua ban : ");
            n = sc.nextInt();
            switch (n) {
                case 1:
                    System.out.println("Toi di ngu");
                    break;

                case 2:
                    System.out.println("Toi di choi");
                    break;

                case 3:
                    System.out.println("Toi di an");
                    break;

                case 4:
                    System.out.println("Toi di hoc");
                    break;

                default:

                    System.out.println("Tam biet!");
                    break;

            }
        } while (n <= 4);

    }
}
