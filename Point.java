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
//represents points in the plane, in  a system of cartesian coordinates; each point has the coordinates x and y
public class Point {
    private double x;
    private double y;

    //overloaded constructors
    public Point(double x1, double y1){x=x1; y=y1;}
    public Point(){x=0.0; y=0.0;}

    public double getX(){ return this.x; }
    public double getY(){ return this.y; }

    //returns the distance between this Point and the other Point
    public double distanceTo(Point other){
        double d = Math.sqrt(Math.pow(x-other.x,2)+Math.pow(y-other.y,2));
        return d;
    }

    //return true if this Point is equal to the other Point; two Points are equal if they have the same coordinates
    public boolean isEqual(Point other){
        if(this.x==other.getX() && this.y==other.getY())
            return true;
        else
            return false;
    }

    //returns the symmetric of this Point with respect to the origin (i.e., it creates a new point which is the
    //symmetric of this point with respect to the origin and returns a reference to the new point)
    public Point symmetric(){
        double pX = -(this.getX());
        double pY = -(this.getY());
        Point newp = new Point(pX, pY);
        return newp;
    }

    //returns a string representation of the object (example: The point has the coordinates x=3.5 and y=7.9)
    public String toString(){
        return "The point had the coordinates x=" + this.getX() + "and y=" + this.getY();
    }
}

