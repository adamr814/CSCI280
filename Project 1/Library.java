import java.util.*;
import java.util.Scanner;

class book{
    String BookTitle;
    String Author;
    int ISBN;
    
    
    //void AddBook(){};

    //String SearchBook(){};

    //int InvAudit(){};

    //void RemoveBook(){};
}

//private class subscriber{}

//private class Borrow{}

public class Library{
    Scanner kb = new Scanner(System.in);
    public static void main(String[] args){
        System.out.print("*****  Library Management System  V0.4  *****\n\n");
        printMenu();
        int choice = 0;
        choice = kb.nextInt();
        boolean iterator = true;
        while(iterator = true){
            if(choice == 1){
                printBookMenu();}

            else if(choice == 2){
                printSubMenu();}

            else if(choice == 3){
                printBorrowMenu();}
            
            else if(choice == 4){
                System.out.print("Exiting Program ");
                iterator = false;
            }
            else{
                System.out.print("Invalid Entry");   
        }}}


    public static void printMenu(){ 
        String MenuString = "1: Enter Book Management\n" +
        "2: Enter Subscriber Management\n" +
        "3: Enter Borrowed Media Management\n" +
        "Please Enter an Option: ";
        System.out.print(MenuString);}

    public static void printBookMenu(){
        String BookMenu = "1: Add a book to the system\n" +
        "2: Search for a book in the system\n" +
        "3: Inventory audit\n" +
        "4: Remove book from system\n" +
        "Please Enter an Option: ";
        System.out.print(BookMenu);}

    static void printSubMenu(){
        String BookMenu = "1: Add a subscriber\n" +
        "2: Update subscriber information\n" +
        "3: Remove subscriber\n" +
        "4: Check current holdings\n" +
        "Please Enter an Option: ";
        System.out.print(BookMenu);}

    static void printBorrowMenu(){
        String BookMenu = "1: Add a book to the system\n" +
        "2: Search for a book in the system\n" +
        "3: Inventory audit\n" +
        "4: Remove book from system\n" +
        "Please Enter an Option:";
        System.out.print(BookMenu);}

}