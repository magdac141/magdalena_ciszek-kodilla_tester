public class LeapYear {
    public static void main(String[] args) {
        int year = 2100;

        if (checkLeapYear(year)) {
            System.out.println("Rok " + year + " jest przestępny");
        } else {
            System.out.println("Rok " + year + " NIE jest przestępny");
        }

    }

    private static boolean checkLeapYear(int a) {

        if (a%4 != 0){
            return false;
        } else if (a%100 != 0) {
            return true;
        } else if (a%400 != 0) {
            return false;
        } else {
            return true;
        }
    }

}