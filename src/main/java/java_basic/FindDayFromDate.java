package java_basic;
public class FindDayFromDate {
    public static void main(String[] args) {
        int day = 1;
        int month = 1;
        int year = 2016;
        int dayOfWeek = 0;
        int totalDays = 0;
        int[] daysInMonth = {31, 28, 31, 30, 31, 30,
                31, 31, 30, 31, 30, 31};
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    daysInMonth[1] = 29;
                }
            } else {
                daysInMonth[1] = 29;
            }
        }
        for (int i = 0; i < month - 1; i++) {
            totalDays += daysInMonth[i];
        }
        totalDays += day;
        dayOfWeek = totalDays % 7;
        switch (dayOfWeek) {
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid day");
                break;
        }
    }
}


