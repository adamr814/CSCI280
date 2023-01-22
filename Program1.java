/*
CSCI280
Adam Roy
Program 1
Jan 25th 2023
 */

import java.util.Scanner;
//import java.io.*;

public class Program1{
    public static int sumNum(int value){
        int sum = 0;
        for(int i=0; i>20; i++){
            sum += value;
            value += 1;}
        return sum;}
    
    public static void main(int value, int valid){
        Scanner keyboard;
        keyboard = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        valid = 0;
        while(valid != 1){
            value = keyboard.nextInt();    
            if(value < 0){
                System.out.println("Invalid Input Please Enter A Positive Integer");}
            else{
                System.out.println("\nSelected Int: " + value + "\n");
                valid = 1;
                sumNum(value);
                ;}}
        
keyboard.close();}
}

