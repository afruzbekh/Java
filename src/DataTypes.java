// public class secondTest {
//     public static void main(String[] args) {
//         System.out.println("what is the texxxttt");
//     }
// }

// public class thirdTest {
//     public static void main(String[] args) {
//         System.out.println("Ada Lovelace");
//     }
// }
// public class OnceUponATime {
//     public static void main(String[] args) {
//        System.out.println();
//     }
// }
// public class Dinosaur {
//     public static void main(String[] args) {
//         System.out.println("Once upon a time");
//         System.out.println("there was");
//         System.out.println("a dinosaur");
//     }
// }
// import java.util.Scanner;
// public class Prompt {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.println("Write a message:");
//         String message = scanner.nextLine();
//         System.out.println(message);
//     }
// }
// import java.util.Scanner;
// public class PromptTaskOne {
//     public static void main(String[] args) {
//         Scanner notScanner = new Scanner(System.in);
//         System.out.println("Write a message:");     
//         String promptMessage = notScanner.nextLine();
//         System.out.println(promptMessage);
//         notScanner.close();
//         String number = "higger";
//         System.out.println(number + "... wassssssssssssssssuuuuuuuuuuuuuuuuuuuup");
//         String start = "My name is ";
//         String end = "James Bond!";
//         System.out.println(start + "Bond, " + end);
//     }
// }
// import java.util.Scanner;
// public class Program {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.println("Write something: ");
//         String message = scanner.nextLine();
//         System.out.println("You wrote " + message);
//     }
// }
// import java.util.Scanner;
// public class Greeting {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
// Scanner reader = new Scanner(System.in);
// System.out.println("--------  What is your name? --------");
// String name = scanner.nextLine();
// System.out.println("Good evening Mr." + name);
// System.out.println("Write the first string:");
// String firstString = scanner.nextLine();
// System.out.println("Write the second string:");
// String secondString = scanner.nextLine();
// System.out.println("Write the third string:");
// String thirdString = scanner.nextLine();
// System.out.println("You wrote:");
// System.out.println(firstString);
// System.out.println(secondString);
// System.out.println(thirdString);
// System.out.println("-------- Greetings! How are you doing? --------");
// String firstString = scanner.nextLine();
// System.out.println("-------- Oh, how interesting! Tell me more! --------");
// String secondString = scanner.nextLine();
// System.out.println("-------- Write the first string:");
// String first = reader.nextLine();
// System.out.println("-------- Write the second string:");
// String second = reader.nextLine();
// System.out.println("-------- Write the third string:");
// String third = reader.nextLine();
// System.out.println("Last string you wrote was " + third + ", which ");
// System.out.println("was preceded by " + second+ ".");
// System.out.println("The first string was " + first + ".");
// System.out.println("All together: " + first + second + third);
// System.out.println("-------- I will tell you a story, but I need some information first, Okay? --------");
// String permission = scanner.nextLine();
// System.out.println("-------- Great! Now, What is the main character called? ---------");
// String characterName = scanner.nextLine();
// System.out.println("-------- What is their job?---------");
// String characterJob = scanner.nextLine();
// System.out.println("-------- Here is the story:--------");
// System.out.println("Once upon a time there was " + characterName + ", who was a " + characterJob + ". On the way to work, " + characterName + " reflected on life. Perhaps " + characterName + " will not be a " + characterJob + " forever.");
// }
// }

import java.util.Scanner;

public class DataTypes {
    public static void main(String[] args) {
        // String text = "contains text";
        // int wholeNumber = 123;
        // double floatingPoint = 3.141592653;
        // boolean trueOrFalse = true;

        // System.out.println("Text variable: " + text);
        // System.out.println("Integer variable: " + wholeNumber);
        // System.out.println("Floating-point variable: " + floatingPoint);
        // System.out.println("Boolean: " + trueOrFalse);

        // int chickenWeight = 9000;
        // double BaconWeight = 0.1;
        // String tractotQuantity = "Zetor";

        // System.out.println("Chicken: " + chickenWeight);
        // System.out.println("Bacon (kg): " + BaconWeight);
        // System.out.println("Tractor: " + tractotQuantity);

        // System.out.println("and finally, a summary:");

        // System.out.println(chickenWeight);
        // System.out.println(BaconWeight);
        // System.out.println(tractotQuantity);

        // int value = 10;
        // System.out.println(value);
        // value = 4;
        // System.out.println(value);

        // int number = 123;
        // System.out.println("The value of the variable is " + number);

        // number = 42;
        // System.out.println("The value of the variable is " + number);

        // double pi = 3.14;
        // double radius = 22.0;
        // double surfaceArea = pi * radius * radius;

        // System.out.println(surfaceArea);

        // Scanner scanner = new Scanner(System.in);

        // System.out.println("Give a number:  ");
        // String text = scanner.nextLine();
        // System.out.println("You gave the number " + text);

        // Scanner scanner = new Scanner(System.in);

        // System.out.println("Write a value ");
        // double value = Integer.valueOf(scanner.nextLine());
        // System.out.println("You wrote " + value);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Write a boolean ");
        boolean value = Boolean.valueOf(scanner.nextLine());
        System.out.println("You wrote " + value);
    }
}
