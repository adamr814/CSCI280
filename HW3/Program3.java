/*
CSCI280
Adam Roy
Program: 3
Due: Feb 1st 2023
*/

public class Program3{
    public static void main(String[] args){
        Student info1 = new Student();
        info1.enrollNumber = 5;
        info1.studentName = ("    John             ");
        Student info2 = new Student();
        info2.enrollNumber = 6;
        info2.studentName = ("    Bruce            ");
        System.out.println("Student Name | Enroll Number");
        System.out.println(info1.studentName + info1.enrollNumber);
        System.out.println(info2.studentName + info2.enrollNumber);
    }}

class Student{
    String studentName;
    int enrollNumber;}