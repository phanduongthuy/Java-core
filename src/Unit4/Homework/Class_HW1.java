/*
 Giải phương trình bậc nhất.
 */
package Unit4.Homework;

import java.util.Scanner;

public class Class_HW1 {

    private float a;
    private float b;
    private float x;

    public float getA() {
        return this.a;
    }

    public float getB() {
        return this.b;
    }

    public void setA(float a) {
        this.a = a;
    }

    public void setB(float b) {
        this.b = b;
    }

    public float getX() {
        return this.x;
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi ban nhap hai so a va b.");
        System.out.print("Số a = ");
        this.a = sc.nextFloat();
        System.out.print("Số b = ");
        this.b = sc.nextFloat();
    }

    public void giai_pt() {
        System.out.println("Nghiệm của phương trình bậc nhất có: ");
        System.out.println("Hệ số a = " + this.getA());
        System.out.println("Hệ số b = " + this.getB());
        System.out.println();

        if (this.a == 0 && this.b == 0) {
            System.out.println("Phương trình có vô số nghiệm.");
        } else if (this.a == 0 && this.b != 0) {
            System.out.println("Phương trình vô nghiệm.");
        } else {
            this.x = (-this.b) / this.a;
            System.out.println("Phương trình có nghiệm x = " + this.x);
        }

    }
}
