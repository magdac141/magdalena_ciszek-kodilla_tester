import java.util.Scanner;
public class switch1 {
    public static String getChar() {
        String val = " ";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write first letter of the color and press [ENTER]: ");
        val = scanner.nextLine().trim().toUpperCase();
        String retChar = val.substring(0,1);
        return retChar;
    }

    public static void main(String[] args) {

        switch1 sw1 = new switch1();

        String color = sw1.getChar();
        // System.out.println("Znak koloru : " + color );
        switch (color) {
            case "R":
                System.out.println("Color is RED");
                break;
            case "G":
                System.out.println("Color is GREEN");
                break;
            case "B":
                System.out.println("Color is BLUE or BLACK");
                break;
            case "Y":
                System.out.println("Color is YELLOW");
                break;
            case "C":
                System.out.println("Color is CYAN");
                break;
            case "V":
                System.out.println("Color is VIOLET");
                break;
            case "M":
                System.out.println("Color is MAGENTA");
                break;
            case "O":
                System.out.println("Color is ORANGE");
                break;
            case "W":
                System.out.println("Color is WHITE");
                break;
            default:
                System.out.println("Unknown color: (" +color+ ")");
        }
    }
}