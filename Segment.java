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
//represents segment lines; fields end1 and end2 represent the two endpoints of the segment line
//uses class Point defined previously
public class Segment {
    private Point end1;
    private Point end2;

    public Segment(double x1, double x2, double y1,double y2){
        end1 = new Point(x1,y1);
        end2 = new Point(x2,y2);   
    }
    /*initializes end1 to a Point with coordinates x1, y1,
     and end2 to a Point with coordinates x2, y2 */

    public Segment(){
        end1 = new Point();
        end2 = new Point();
    }
    /* no argument public constructor which initializes end1 to a
    Point with coordinates 0,0, and end2 to a Point with coordinates 1,1 */

    public double getX1(){ return end1.getX(); }/* returns the field x of end1 */
    public double getY1(){ return end1.getY(); }/* returns the field y of end1 */
    public double getX2(){ return end2.getX(); }/* returns the field x of end2 */
    public double getY2(){ return end2.getY(); }/* returns the field y of end2 */

    public Point getEnd1(){
        Point nend1 = new Point(getX1(),getY1());
        return nend1;
    }//returns a new point with the same coordinates as end1
    public Point getEnd2(){
        Point nend2 = new Point(getX2(),getY2());
        return nend2;
    }//returns a new point with the same coordinates as end2
    public double length(){
        return getEnd1().distanceTo(getEnd2());
    }
    /* returns the length of this segment;
    it MUST use the method distanceTo() from class Point */
    public boolean isLonger(Segment other){ 
        if(this.length()>other.length())
            return true;
        else
            return false;
    }
    /* returns true
     if this Segment is longer than the other Segment and false otherwise;
     it MUST use method length() */

    public Point midPoint(){
        Point midp = new Point((getEnd1().getX()+getEnd2().getX())/2,(getEnd1().getY()+getEnd2().getY())/2);
        return midp;
    }
    /* returns a new Point representing
    	the middle of this Segment (it creates a new Point object
    	and returns a reference to it); note the coordinates of the middle are the averages of the coordinates of the end points*/

    public boolean isEqual(Segment other){
        if(this.getEnd1()==other.getEnd1() && this.getEnd2()==other.getEnd2())
            return true;
        else if(this.getEnd1()==other.getEnd2() && this.getEnd2()==other.getEnd1())
            return true;
        else
            return false;
    }
    //returns true if this segment is equal to the other segment;
    //two segment lines are eqaul if they have the same end points, but not necessarily in the same order
    public static double longest(Segment[] arr){
        Segment longest=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i].isLonger(longest))
                longest=arr[i];
        }
        return longest.length();
    }
    /* returns the length
        of the longest Segment in the array; it MUST use method isLonger()*/
    //returns a string representation of the segment line
    public String toString(){
        return "The segment has endpoints end1=" + getEnd1() + "and end2=" + getEnd2();
    }
}//end class Segment

