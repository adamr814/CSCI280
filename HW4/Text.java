public class Holiday {
    String name;
    int day;
    String month;

    Holiday(String theName, int theDay, String theMonth){
        name = theName;
        day = theDay;
        month = theMonth;
    }
    
    Holiday(){

    }

    static boolean inSameMonth(Holiday constructedHoliday1, Holiday constructedHoliday2){
        return constructedHoliday1.month.equals(constructedHoliday2.month);
    }

    public static void main(String args[]){
        String answer;
        Holiday constructedHoliday1 = new Holiday("Independence Day", 4, "July");
        Holiday constructedHoliday2 = new Holiday("Labor Day", 5, "July");

        if (inSameMonth(constructedHoliday1, constructedHoliday2) == true){
            answer = "Yes";
        }
        else{
            answer = "No";
        }
        System.out.println("Do they fall in the same month? " + answer);
    }
}