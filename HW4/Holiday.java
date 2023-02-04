/*
CSCI280
Adam Roy
Program: 4
Due: Feb 3rd 2023
*/

public class Holiday{
    String HN; //Holiday Name
    int DoM; //Day of Month
    String M; //Month
    
    //Constructor 1
    Holiday(String HolidayName, int MonthDay, String Month){
        HN = HolidayName;
        DoM = MonthDay;
        M = Month;}

    //Constructor 2 (No-Args)
    Holiday(){
        String HolidayName = "Labor Day";
        int MonthDay = 5;
        String Month = "September";}
    
    static Boolean inSameMonth(Holiday C1, Holiday C2){
        return C1.M.equals(C2.M);}

public static void main(String[] args){
    Holiday C1 = new Holiday("Independence Day", 4, "July");
    Holiday C2 = new Holiday();
    if(inSameMonth(C1, C2)==true){
        System.out.print("Holidays are in the same month\n");}
    else{
        System.out.print("Holidays are not in same month\n");}}}
