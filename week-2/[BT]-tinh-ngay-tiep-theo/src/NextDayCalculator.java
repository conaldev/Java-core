public class NextDayCalculator {
    public static String nextDayCalculator(int day, int month, int year) {
        int maxDay = 0;
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                maxDay = 31;
            break;
            case 2:
                if (isLeapYear(year))
                    maxDay = 29;
                else
                    maxDay = 28;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                maxDay = 30;
                break;
        }

        if (day == maxDay) {
            day = 1;
            if (month == 12) {
                month = 1;
                year++;
            } else
                month++;
        } else
            day++;
        String nextDay=  day + "/" + month + "/" + year;
        return nextDay;
    }

    public static boolean isLeapYear(int year) {
        boolean isDivisibleBy4 = year % 4 == 0;
        boolean isDivisibleBy100 = year % 100 == 0;
        boolean isDivisibleBy400 = year % 400 == 0;
        if (isDivisibleBy400)
            return true;
        else if (isDivisibleBy4 && !isDivisibleBy100)
            return true;
        else
            return false;
    }
}
