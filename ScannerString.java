import java.util.Scanner;

public class ScannerString {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(str);
        String secondString = " And one more string.";
        System.out.println(str + secondString);
        System.out.println(str.length());
        System.out.println(str.isEmpty());
        System.out.println(str.charAt(2));
        String moreString = "Absolutely different string";
        System.out.println(str.equals(moreString));
        String lowerCase = "this is a string.";
        System.out.println(str.equalsIgnoreCase(lowerCase));
        System.out.println(str.startsWith("That"));
        System.out.println(str.endsWith("ing."));
        System.out.println(str.contains("is"));
        System.out.println(str.concat("Not an int."));
        System.out.println(str.replace("i", "e"));
        System.out.println(str.toLowerCase());

    }

}




