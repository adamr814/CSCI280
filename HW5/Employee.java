/*
CSCI280
Adam Roy
Program: 5
Due: Feb 10th 2023
*/

public class Employee{
    private int employeeID;
    private String FirstName;
    private String LastName;
    private int Salary;

    //Constructor 1
    public Employee(int employeeID, String FirstName, String LastName, int Salary){
        this.employeeID = employeeID;
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.Salary = Salary;
    }
        
    //Constructor 2 (no-args)
    public Employee(){
        System.out.println("No Args Constructed\n");
    }

    //getters
    public int getEmployeeID(){
        return this.employeeID;}

    public String getFirstName(){
        return this.FirstName;}

    public String getLastName(){
        return this.LastName;}

    public int getSalary(){
        return this.Salary;}

    //setters
    public void setEmployeeID(int employeeID){
        this.employeeID = employeeID;}

    public void setFirstName(String FirstName){
        this.FirstName = FirstName;}

    public void setLastName(String LastName){
        this.LastName = LastName;}

    public void setSalary(int Salary){
        this.Salary = Salary;}

    //methods
    public String getFullName(){
        String FullName = getFirstName() + " " + getLastName();
        return FullName;}

    public int calculateAnnualSalary(){
        int MonthlySalary = getSalary();
        return (MonthlySalary * 12);}

    public void increaseSalary(int percent){
        System.out.println("\n-------------------------------------------------------------\nApplying an increase of salary of " + percent + "% ...\n-------------------------------------------------------------");
        //wait function to make it seem like something is happening
        try {Thread.sleep(3000);} catch (InterruptedException e) {e.printStackTrace();}
        System.out.println("Done\n");
        try {Thread.sleep(2000);} catch (InterruptedException e) {e.printStackTrace();}
        //end of wait function
        int S = getSalary();
        int newSalary = (S += (S * percent)/100);
        setSalary(newSalary);}
    }
class EmployeeMain{
    public static void main(String[] args){
        Employee employee = new Employee(2345895, "Chase", "Cody", 12000);
        System.out.println("The employee details: ");
        System.out.println("    ID: " + employee.getEmployeeID());
        System.out.println("    First Name: " + employee.getFirstName());
        System.out.println("    LastName: " + employee.getLastName());
        System.out.println("    Salary: " + employee.getSalary());
        
        System.out.print("\n-------------------------------------------------------------\nUpdating the employee details...\n-------------------------------------------------------------\n");
        //wait function to make it seem like something is happening
        try {Thread.sleep(3000);} catch (InterruptedException e) {e.printStackTrace();}
        System.out.println("Done\n");
        try {Thread.sleep(2000);} catch (InterruptedException e) {e.printStackTrace();}
        //end of wait function

        //setting new employee information here
        employee.setEmployeeID(2345899);
        employee.setFirstName("John");
        employee.setLastName("Cody Mark");
        employee.setSalary(14000);
        System.out.println("The new employee details:" );
        System.out.println("    ID: " + employee.getEmployeeID());
        System.out.println("    Full Name: " + employee.getFullName());
        System.out.println("    Salary: " + employee.getSalary());
        System.out.println("    Annual Salary: " + employee.calculateAnnualSalary());

        //calling increase salary function
        employee.increaseSalary(10);
        System.out.println("The new employee details:" );
        System.out.println("    ID: " + employee.getEmployeeID());
        System.out.println("    Full Name: " + employee.getFullName());
        System.out.println("    Salary: " + employee.getSalary());
        System.out.println("    Annual Salary: " + employee.calculateAnnualSalary());
    }}
