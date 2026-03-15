/*
Q3. A company has two types of employees:
     Employee
     PermanentEmployee
The Employee class contains:
     double salary
     Method displaySalary()
The PermanentEmployee class inherits Employee and contains:
     Method calculateBonus() that calculates 10% bonus.
The bonus must be displayed as an integer value using type casting.
Write a Java program that:
    1. Creates a PermanentEmployee object.
    2. Displays salary.
    3. Calculates and prints the bonus after converting it to in
*/

package lab6tasks;

class Employeee{
    double salary = 58792;
    void displaySalary(){
        System.out.println("Salary is: "+salary);
    }
}

public class PermanentEmployee extends Employeee {
    void calculateBonus(){
        double bonus = salary*0.1;
        System.out.println("Bonus is: "+ (int)bonus);
    }
}

class MAINNN{
    public static void main(String[] args) {
        PermanentEmployee e = new PermanentEmployee();
        e.displaySalary();
        e.calculateBonus();

    }
}
