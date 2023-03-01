/*
 * CSCI280
 * Adam Roy
 * In class task
 * Due: Mar 1st 2023
 */
import java.util.Scanner;

 public class Task0301{
    public static void main(String[] args){
        int x = -99999;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Please enter an integer: ");
        x = keyboard.nextInt();
        while(x < 0){
            System.out.println("\n***** Negative Int Entered *****\n");
            System.out.print("Please enter an integer: ");
            x = keyboard.nextInt();
        }
        System.out.println("\n***** Positive Integer Entered *****" + "\n\n***** Exiting Program *****");
        keyboard.close();
    }
 }