import java.util.*;
import java.util.Scanner;

class book{
    private String BookTitle;
    private String Author;
    private int ISBN;
    private int Copies;

    public book(String BookTitle, String Author, int copies){
        this.BookTitle = BookTitle;
        this.Author = Author;
        this.Copies = copies;}

    //Getters for book class
    public String getBookTitle(){
        return this.BookTitle;}
    public String getAuthor(){
        return this.Author;}
    //Setters for book class
    public void setBookTitle(String BookTitle){
        this.BookTitle = BookTitle;}
    public void setAuthor(String Author){
        this.Author = Author;}
    public void setCopies(int Copies){
        this.Copies = Copies;}
    
}
class subscriber{
    private String FirstName;
    private String LastName;
    private String Address;
    
    public subscriber(String FirstName, String LastName, String Address){
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.Address = Address;}
    
    //Getters for subscriber class
    public String getFirstName(){
        return this.FirstName;}
    public String getLastName(){
        return this.LastName;}
    public String getAddress(){
        return this.Address;}
    //Setters for subscriber class
    public void setFirstName(String FirstName){
        this.FirstName = FirstName;}
    public void setLastName(String LastName){
        this.LastName = LastName;}
    public void setAddress(String Address){
        this.Address = Address;}
    }
}

//private class Borrow{}

public class Library{
    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);
        System.out.print("*****  Library Management System  V0.6  *****\n\n");
        printMenu();
        int choice = 0;
        choice = kb.nextInt();
        switch(choice){
            case 1:
                printBookMenu();
                choice = kb.nextInt();
                switch(choice){
                    case 1:
                    String BookTitle = kb.next();
                    String Author = kb.next();
                    int ISBN = kb.nextInt();
                    int Copies = kb.nextInt();
                    book = new book(BookTitle, Author, Copies );
                    break;
                    //add book;
                    
                    //case 2:
                    //search for book;
                    
                    //case 3:
                    //change details;
                    
                    //case 4:
                    //inventory audit;
                    
                    //case 5:
                    //remove book;
                    
                    default:
                    System.out.print("Text 2");
                    break;
                    //invalid input
                } break;
            case 2:
                printSubMenu();
                choice = kb.nextInt();
                switch(choice){
                    case 1:
                        System.out.print("Text 3");
                        break;
                    default:
                        System.out.print("Text 4");
                        break;
                }}
                
        

        //else if(choice == 2){
            //printSubMenu();}

        //else if(choice == 3){
            //printBorrowMenu();}
            
        //else if(choice == 4){
            //System.out.print("Exiting Program ");
            //System.exit(0);}
        //else{
            //System.out.print("Invalid Entry");   
        //}
    kb.close();}


    public static void printMenu(){ 
        String MenuString = "\n1: Enter Book Management\n" +
        "2: Enter Subscriber Management\n" +
        "3: Enter Borrowed Media Management\n" +
        "Please Enter an Option: ";
        System.out.print(MenuString);}

    public static void printBookMenu(){
        String BookMenu = "\n1: Add a book to the system\n" +
        "2: Search for a book in the system\n" +
        "3: Change book details\n" +
        "4: Inventory audit\n" +
        "5: Remove book from system\n" +
        "Please Enter an Option: ";
        System.out.print(BookMenu);}

    static void printSubMenu(){
        String BookMenu = "\n1: Add a subscriber\n" +
        "2: Update subscriber information\n" +
        "3: Remove subscriber\n" +
        "4: Check current holdings\n" +
        "Please Enter an Option: ";
        System.out.print(BookMenu);}

    static void printBorrowMenu(){
        String BookMenu = "\n1: Add a book to the system\n" +
        "2: Search for a book in the system\n" +
        "3: Inventory audit\n" +
        "4: Remove book from system\n" +
        "Please Enter an Option:";
        System.out.print(BookMenu);}

}