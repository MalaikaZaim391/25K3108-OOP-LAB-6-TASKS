Q1. A company wants to design a simple employee management system.
1. There is a Parent class called Employee.
2. It contains a method work() that displays a message.
3. A Child class called Manager inherits from Employee.
4. A Child class called Manager inherits from Employee.
5. The Manager class has an additional method manageTeam().
Write a Java program that creates a Manager object and calls both methods.

Q2. A university system contains three levels of classes:
1. Person
2. Student
3. GraduateStudent

Relationships:
1. Student inherits Person 
2. GraduateStudent inherits Student

Each class contains a method:
1. Person → displayPerson()
2. Student → displayStudent()
3. GraduateStudent → research()
   
Write a program that creates a GraduateStudent object and calls all methods.
   
Q3. A company has two types of employees:
1. Employee
2. PermanentEmployee
   
The Employee class contains:
1. double salary
2. Method displaySalary()
   
The PermanentEmployee class inherits Employee and contains:

1. Method calculateBonus() that calculates 10% bonus.
2. The bonus must be displayed as an integer value using type casting.
   
Write a Java program that:
1. Creates a PermanentEmployee object.
2. Displays salary.
3. Calculates and prints the bonus after converting it to in
   
Q4. A banking system has three classes:
1. Account
2. SavingsAccount
3. PremiumSavings

Relationships:
1. SavingsAccount inherits Account
2. PremiumSavings inherits SavingsAccount
   
The Account class contains:
1. double balance
2. The PremiumSavings class calculates interest (7%).
   
The final interest must be printed as an integer using casting.

Q5. Create a class Animal with method sound().
Create subclasses:
1. Dog
2. Cat

Each class overrides sound().
In the main method:
1. Store objects of Dog and Cat in Animal references.
2. Call sound().
