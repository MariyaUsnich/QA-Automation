public class Main {
    public static void main (String[] args) {
        myInfo("Mariya", 31, "Editor");
        System.out.println();
        allVariables();
    }
    private static void myInfo(String myFirstName, int myAge, String myProfession){
    System.out.println("My name is "+ myFirstName +".\n"+"I'm "+ myAge + ".\n"+"I am an " + myProfession + ".");
    }
     private static void allVariables() {
        byte typeByte = 127;
        System.out.println(typeByte);
        short typeShort = 32767;
        System.out.println(typeShort);
        int typeInt = 2147483647;
        System.out.println(typeInt);
        long typeLong = 1000000000000000000L;
        System.out.println(typeLong);
        float typeFloat = 3.14f;
        System.out.println(typeFloat);
        double typeDouble = 3.14d;
        System.out.println(typeDouble);
        boolean typeBoolean;
         typeBoolean = true;
         System.out.println(true);
        char typeChar = 'x' ;
        System.out.println(typeChar);
        String typeString = "Many Chars";
        System.out.println(typeString);
     }
}