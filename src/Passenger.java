import java.util.Scanner;

public class Passenger {
    /** Method to add customers */
    public static void passenger() {
        Scanner responce = new Scanner(System.in);
        System.out.println("Enter surname for Cabin " + Main.cabNum + "              :");
        Main.cabSurname = responce.next();
        System.out.println("You have to adding 2 passengers for cabin" +Main.cabNum +"Or you haven't adding customer press 'e'");
        System.out.println("Enter other second customer for cabin "+Main.cabNum+"      :");
        Main.another1=responce.next();
        System.out.println("Enter other third customer for cabin "+Main.cabNum+"     :");
        Main.another2=responce.next();
        System.out.println(" Enter the Amount of customer for cabin " + Main.cabNum + "       :");
        Main.amount = responce.nextInt();
        String price = java.lang.String.valueOf(Main.amount);

        Main.ship[Main.cabNum][1]= Main.cabSurname;
        Main.ship[Main.cabNum][2]= price;
        Main.ship[Main.cabNum][3]=Main.another1;
        Main.ship[Main.cabNum][4]=Main.another2;

    }

}
