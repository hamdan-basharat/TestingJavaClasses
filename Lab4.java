/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

/**
 *
 * @author Hamdan
 */
public class Lab4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Student julian = new Student(1,"Julian Morrone");
        julian.increaseGrade(50);
        System.out.println(julian.toString());
        Point V1 = new Point(10.0,5.0);
        Point V2 = new Point(4.0,6.0);
        Point V3 = new Point(8.0,15.0);
        Triangle T1 = new Triangle(V1,V2,V3);
    }
    
}
