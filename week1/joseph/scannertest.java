package week1.joseph;
import java.util.Scanner;

public class scannertest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a day of the week(1-7): ");
        int dayOfWeek = scanner.nextInt();
        if(dayOfWeek <= 7 && dayOfWeek >=1){
            String dayType;
            if(dayOfWeek <= 5){
                dayType = "week day";
            }
            else{
                dayType = "weekend";
            }
            System.out.println("Day " + dayOfWeek +  " is a " + dayType);
             //swithces  
            String day = ""; 
            switch(dayOfWeek){
                case 1:
                    day = "Monday";
                    break;
                case 2:
                    day = "Tuesday";
                    break;
                case 3:
                    day = "Wednesday";
                    break;
                case 4:
                    day = "Thursday";
                    break;
                case 5:
                    day = "Friday";
                    break;
                case 6:
                    day = "Saturday";
                    break;
                case 7:
                    day = "Sunday";
                    break;
            }
        System.out.println("Day " + dayOfWeek +  " is a " + day);
        } 
        else{
            System.out.println("Invalid day");
        }
        scanner.close();
    }
}
