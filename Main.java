import java.util.Scanner;

public class Main {

    public static void main(String[] arg) {
        Scanner input = new Scanner(System.in);




        int houseNum, zipcode;
        String stAddress, city, state;
        //System.out.println("House Number: ");
        houseNum = input.nextInt();

        stAddress= input.nextLine();
        city = input.nextLine();

        state = input.nextLine();
        //input.nextLine();
        //System.out.println("ZipCode: ");
        zipcode = input.nextInt();

        //System.out.println("Street Address ");

        //System.out.println("City: ");


        //System.out.println("State: ");


        System.out.print(houseNum + " " + stAddress +" "+ city +" "+ state+" "+ zipcode);

    }


}






  