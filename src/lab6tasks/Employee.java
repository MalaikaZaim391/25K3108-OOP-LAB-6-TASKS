/*
Q1. A company wants to design a simple employee management system.
     There is a Parent class called Employee.
     It contains a method work() that displays a message.
     A Child class called Manager inherits from Employee.
     The Manager class has an additional method manageTeam().
Write a Java program that creates a Manager object and calls both methods.
*/

package lab6tasks;

public class Employee {
    void work() {
        System.out.println("Employee works");
    }
}

class Manager extends Employee{
    void manageTeam(){
        System.out.println("Manager manage teams");
    }
}

class MAIN{
    public static void main(String[] args) {
        Manager m = new Manager();
        m.work();
        m.manageTeam();
    }
}



