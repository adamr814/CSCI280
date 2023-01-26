/*
CSCI280
Adam Roy
Program: 2
Due: Jan 25th 2023
*/

import java.util.Scanner;

public class Program2{
    public static void sumNum(String StopChr){
        Scanner keyboard = new Scanner(System.in);
        int sum = 0;
        String val="";
        while(val.equals("")){
            System.out.print("\nEnter a positive Integer (Type '" + StopChr + "' to Quit): ");
            val = keyboard.nextLine();
            if(val.equalsIgnoreCase(StopChr)){break;}
            else if(val.matches("\\-?\\+?\\d+")){
                if(Integer.parseInt(val) < 0){
                    System.out.println("\n*********************\n   Invaild Integer\n*********************");}
                else{sum += Integer.parseInt(val);
                System.out.println("Current Sum: " + sum);}}
            val="";} keyboard.close();}
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter Stop Character: ");
        String StopChr = keyboard.next();
        sumNum(StopChr);
        keyboard.close();}}