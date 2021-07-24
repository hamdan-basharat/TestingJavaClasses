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
public  class Student{

	private int id;
	private int grade;
	private String name;

//constructor; initializes id to n, name to someName and grade to 0
	public Student (int n, String someName ){
		id=n;
                name=someName;
                grade=0;
	}

	//sets the grade to mark if 0<=mark <=100; if mark is < 0, grade is set to 0; if mark > 100; grade is set to 100.
	public void setGrade( int mark ){
		if (mark < 0)
			grade = 0;
		else if (mark <= 100)
			grade = mark;
		else
			grade = 100;
	}

	//returns grade
	public int getGrade( ){
		return grade;
    }


	//returns ID
        public int getId( ){
		return id;
    }

        //returns the student's name
        public String getName(){
                 return name;
    }

	// increases grade by adding to it the bonus, up to the limit of 100, and returns the new grade
	public int increaseGrade( int bonus ){
		setGrade( grade + bonus );
		return grade;
	}

	//compares the grades of this student and that student
	//and returns true if this student has higher grade, false otherwise
	public boolean gradeIsHigher(Student that){
            return grade>that.grade;
	}

	//static method that returns the highest grade of the students in array a
	public static int highestGrade(Student[] a){
            int highest=a[0].grade;// initialized as the grade of the first student
            for(int i=0; i<a.length; i++){
                if(highest<a[i].grade)
                    highest = a[i].grade;
            }
            return highest;
	}

	//returns a string representation of the object
	//(example: The student Robert Ford has the iD 6574 and the grade 100)
	public String toString(){
            return "Student " + name + " has ID " + id + " and grade " + grade;
	}

} // end of class definition
