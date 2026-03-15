/*
Q2. A university system contains three levels of classes:
    1. Person
    2. Student
    3. GraduateStudent
Relationships:
     Student inherits Person
     GraduateStudent inherits Student
Each class contains a method:
     Person → displayPerson()
     Student → displayStudent()
     GraduateStudent → research()
Write a program that creates a GraduateStudent object and calls all methods.
*/

package lab6tasks;

public class Person {
    void displayPerson(){
        System.out.println("Displaying Person");
    }
}

class Student extends Person{
    void displayStudent(){
        System.out.println("Displaying Student");
    }
}

class GraduateStudent extends Student{
    void research(){
            System.out.println("Graduate Students do Research");
        }
}

class MAINN{
    public static void main(String[] args) {
        GraduateStudent s1 = new GraduateStudent();
        s1.displayPerson();
        s1.displayStudent();
        s1.research();
    }
}


