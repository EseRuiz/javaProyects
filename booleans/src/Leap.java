public class Leap {
    boolean isLeapYear(int year) {
        boolean resValue = false ;
        if (year % 4 == 0 && year % 100 != 0){ resValue = true;}
        else if (year % 4 == 0 && year % 100 == 0 && year % 400 == 0) {
            resValue = true;
        }
        return resValue;
    }
}
