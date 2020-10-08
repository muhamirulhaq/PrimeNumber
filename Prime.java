import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {

        Scanner inputUser = new Scanner(System.in);

        String confirmation = "OK";

        int number;
        
        while(confirmation.equals("OK")) {
            System.out.print("\nInput number: ");
            number = inputUser.nextInt();

           if(number >= 2) {
               if(number == 2 || number == 3 || number == 5) {
                   System.out.println(number + " is prime number");
                   System.out.print("\nInput again? : ");
                   confirmation = inputUser.next();
               } else {
                   if(number % 2 == 0 || number % 3 == 0 || number % 5 == 0) {
                       System.out.println(number + " isn't prime number");
                       System.out.print("\nInput again? : ");
                       confirmation = inputUser.next();
                   } else {
                       System.out.println(number + " is prime number");
                       System.out.print("\nInput again? : ");
                       confirmation = inputUser.next();
                   } 
               }
           } else {
               System.out.println(number + " isn't prime number");
               System.out.print("\nInput again? : ");
               confirmation = inputUser.next();
           }
        }

        inputUser.close();
    }
}
