import java.util.*;

import java.util.Scanner;

class book{
    private String BookTitle;
    private String Author;
    private int ISBN;
    private int Copies;

    public book(String BookTitle, String Author, int ISBN, int copies){
        this.BookTitle = BookTitle;
        this.Author = Author;
        this.ISBN = ISBN;
        this.Copies = copies;}

    //Getters for book class
    public String getBookTitle(){
        return this.BookTitle;}
    public String getAuthor(){
        return this.Author;}
    public int getISBN(){
        return this.ISBN;}
    public int getCopies(){
        return this.Copies;}

    //Setters for book class
    public void setBookTitle(String BookTitle){
        this.BookTitle = BookTitle;}
    public void setAuthor(String Author){
        this.Author = Author;}
    public void setISBN(int ISBN){
        this.ISBN = ISBN;}
    public void setCopies(int Copies){
        this.Copies = Copies;}}

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
        this.Address = Address;}}

//class Borrow{}

public class Library{
    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);
        System.out.print("*****  Library Management System  V0.7  *****\n\n");
        printMenu();
        int choice = 0;
        choice = kb.nextInt();
        switch(choice){
            case 1:
                printBookMenu();
                choice = kb.nextInt();
                switch(choice){
                    case 1: //add book
                        String BookTitle = kb.next();
                        String Author = kb.next();
                        int ISBN = kb.nextInt();
                        int Copies = kb.nextInt();
                        book bookObj = new book(BookTitle, Author, ISBN, Copies);
                        break;
                    
                    case 2: //search for book;
                        System.out.print("Search: ");
                        String Search = kb.next();

                    //case 3: //change details;
                        //Use the setters to change the details here
                        //Also use the search function from earlier to look for a certain book
                    
                    //case 4: //inventory audit;
                        //use a simple function to get all details from objects and then display them to screen


                    //case 5: //remove book;
                        //use a setter to set all values to null or none
                        //or find a built in function to delete objects
                    
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
                    String FirstName = kb.next();
                    String LastName = kb.next();
                    String Address = kb.next();
                    subscriber subObj = new subscriber(FirstName, LastName, Address);
                    break;
                    //add subscriber
                    
                    //case 2:
                    //search for subscriber;
                    
                    //case 3:
                    //change details;
                }}
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