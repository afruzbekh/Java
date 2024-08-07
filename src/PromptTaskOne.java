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

import java.util.Scanner;

public class PromptTaskOne {
    public static void main(String[] args) {
        Scanner notScanner = new Scanner(System.in);

        System.out.println("Write a message:");     

        String promptMessage = notScanner.nextLine();

        System.out.println("You Wrote this text: " + promptMessage);

        notScanner.close();

        // String start = "My name is ";
        // String end = "James Bond!";

        // System.out.println(start + "Bond, " + end);
    }
}



