/*
 Giải phương trình bậc hai.
 */
package Unit4.Homework;

import java.util.Scanner;

public class Class_HW2 {

    private long a;
    private long b;
    private long c;

    public long getA() {
        return this.a;
    }

    public long getB() {
        return this.b;
    }

    public long getC() {
        return this.c;
    }

    public void setA(long a) {
        this.a = a;
    }

    public void setB(long b) {
        this.b = b;
    }

    public void setC(long c) {
        this.c = c;
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhập giá trị của các hệ số a, b, c: ");
        System.out.print("a = ");
        this.a = sc.nextLong();
        System.out.print("b = ");
        this.b = sc.nextLong();
        System.out.print("c = ");
        this.c = sc.nextLong();
    }

    public void giai_pt() {
        if (this.a == 0) {
            if (this.b == 0) {
                if (this.c == 0) {
                    System.out.println("Phương trình có vô số nghiệm.");
                } else {
                    System.out.println("Phương trình vô nghiệm.");
                }
            } else {
                System.out.println("Phương trình có một nghiệm: x = " + (-this.c / this.b));
            }
            return;
        }
        double delta = this.b * this.b - 4 * this.a * this.c;
        double x1, x2;
        if (delta < 0) {
            System.out.println("Phuong trinh vo nghiem.");
        } else if (delta == 0) {
            x1 = (-this.b) / (2 * this.a);
            System.out.println("Phuong trinh co nghiem kep x1 = x2 = " + x1);
        } else {
            x1 = ((-this.b + Math.sqrt(delta)) / (2 * this.a));
            x2 = ((-this.b - Math.sqrt(delta)) / (2 * this.a));
            System.out.println("Phuong trinh co hai nghiem phan biet x1 = "
                    + x1 + " và x2 = " + x2);
        }
    }

}
