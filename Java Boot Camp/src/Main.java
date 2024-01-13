public class Main {
    public static void main(String[] args) {

        //litrals
        //primitive Data Type
        //Numbers [Byte calculation (2^n - 1)]
        byte by = 127; //less value
        short sh = 32767; //normal less value
        int num = 1262152645; //integer value
        long Value = 9292828245784L; // larger value

        //decimal
        float fl = 15000f; //Decimal value
        double pie = 3.14; // Larger decimal value
        boolean bool = false; //Boolean True or False
        char ch = 'C'; //Character


        /*
         Data Type	Size	Description
byte	 1 byte	    Stores whole numbers from -128 to 127
short	 2 bytes	Stores whole numbers from -32,768 to 32,767
int	     4 bytes	Stores whole numbers from -2,147,483,648 to 2,147,483,647
long	 8 bytes	Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
float	 4 bytes	Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
double	 8 bytes	Stores fractional numbers. Sufficient for storing 15 decimal digits
boolean	 1 bit	    Stores true or false values
char	 2 bytes	Stores a single character/letter or ASCII values
        */


        //Non - primitive Data Type
        //Class // Interface //Array //String
        String name = "Welcome to Java Program"; //String Collection character



        System.out.println("primitive Data Type");
        System.out.println("Byte = " + by);
        System.out.println("Short = " + sh);
        System.out.println("Integer = " + num);
        System.out.println("Long = " + Value);
        System.out.println("Float = " + fl);
        System.out.println("Double = " + pie);
        System.out.println("Character = " + ch);
        System.out.println("Boolean = " + bool);
        System.out.println(" ");
        System.out.println("Non-Primitive Data Type");
        System.out.println("String = " + name);
    }
}