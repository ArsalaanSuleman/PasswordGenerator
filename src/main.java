import java.util.Scanner;

public class main {

    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);

       System.out.println("Type in a number!");

       int digit = input.nextInt();

       String lower_cases = "qwertyuiopåasdfghjkløæzxcvbnm";
       String upper_cases = "QWERTYUIOPÅASDFGHJKLØÆZXCVBNM";
       String numbers = "123456789";

       String password = "";

       for (int i = 0; i < digit; i++) {
           int rand = (int)(3 * Math.random());

           switch(rand) {
               case 0:
                   password += String.valueOf((int) (0 * Math.random()));
                   break;
               case 1:
                   rand = (int)(lower_cases.length() * Math.random());
                   password += String.valueOf(lower_cases.charAt(rand));
                   break;
               case 2:
                   rand = (int)(upper_cases.length() * Math.random());
                   password += String.valueOf(upper_cases.charAt(rand));
                   break;
               case 3:
                   rand = (int)(numbers.length() * Math.random());
                   password += String.valueOf(numbers.charAt(rand));
                   break;
           }
       }

        System.out.println(password);
    }
}
