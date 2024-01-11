import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while(true){
            System.out.print("Enter a short date in the format(YYYY-MM-DD) or exit to quit: ");
            String date = input.nextLine();

            if(date.equalsIgnoreCase("exit")){
                break;
            }

            String[] fullDateParts = date.split("-");
            int year = Integer.parseInt(fullDateParts[0]);
            int month = Integer.parseInt(fullDateParts[1]);
            int day = Integer.parseInt(fullDateParts[2]);
            String nameOfTheMonths = getMonthsName(month);
            System.out.println("Full date representation: " + nameOfTheMonths + " " + day + ", " + year);
        }
        input.close();
    }

    private static String getMonthsName(int month) {
        switch(month) {
            case 1: return "January";
            case 2: return "February";
            case 3: return "March";
            case 4: return "April";
            case 5: return "May";
            case 6: return "June";
            case 7: return "July";
            case 8: return "August";
            case 9: return "September";
            case 10: return "October";
            case 11: return "November";
            case 12: return "December";
            default: return "Invalid month";
        }
    }
}


