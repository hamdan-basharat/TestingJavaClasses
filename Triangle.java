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
//represents triangles; each triangle has three vertexes (vertex1, vertex2 and vertex3), which are Point objects
public class Triangle {
    private Point vertex1;
    private Point vertex2;
    private Point vertex3; //fields

    //constructor - receives the coordinates of all three vertexes as arguments
    public Triangle(Point V1, Point V2, Point V3) {
        vertex1=V1;
        vertex2=V2;
        vertex3=V3;
    }
    //another constructor - receives as arguments only the coordinates of two vertexes 
    //and sets the third one to be the origin
    public Triangle(Point V1, Point V2){
        vertex1=V1;
        vertex2=V2;
        vertex3=new Point();
    }
   //method to compute the perimeter of this triangle 
    //i.e., returns the sum of the lengths of all three sides of the triangle;
    //should use method distanceTo from class Point
    public double perimeter(){
        double sum=0.0;
        sum+=this.vertex1.distanceTo(this.vertex2);
        sum+=this.vertex2.distanceTo(this.vertex3);
        sum+=this.vertex3.distanceTo(this.vertex1);
        return sum;   
    }
    //method to return the centroid of the triangle
    public Point centroid(){
        Point cent = new Point((this.vertex1.getX()+this.vertex2.getX()+this.vertex3.getX())/3,(this.vertex1.getY()+this.vertex2.getY()+this.vertex3.getY())/3);
        return cent;
    }
    //method to return a deep copy of this triangle; the deep copy should not share any piece of memory with this triangle
    public Triangle dcopy(){
        Triangle deepcopy = new Triangle(this.vertex1,this.vertex2,this.vertex3);
        return deepcopy;
    }
    //method toString()
    public String toString(){
        return "The triangle has vertices v1=" + this.vertex1 + ", v2=" + this.vertex2 + ", and v3=" + this.vertex3;
    }
}

