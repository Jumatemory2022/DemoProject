import java.util.Scanner;

public class CountNumOfChar {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in) ;

        System.out.println("Please enter your sentence to be counted = ");
        String string = input.nextLine();



        int count = 0;

        for (int i = 0; i <string.length() ; i++) {
            if (string.charAt(i)!=' '){

                count++;
            }
        }

        System.out.println(count);


    }
}
