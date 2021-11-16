/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unit7;

import java.util.ArrayList;

/**
 *
 * @author admin
 */
class Student {

    String name;
    int tuoi;

    public Student(String name, int tuoi) {
        this.name = name;
        this.tuoi = tuoi;

    }

    @Override
    public String toString() {
        return this.name + "_" + this.tuoi;
    }

}

public class Ex2 {

    public static void main(String[] args) {
        ArrayList<Student> sl = new ArrayList<>();
        Student sv = new Student("Thùy", 19);
        sl.add(sv);
        sl.add(new Student("Phan", 19));
        System.out.println(sl);

    }
}
