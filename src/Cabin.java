import java.util.Scanner;

public class Cabin {
    public static void Add() {
        try {
            Scanner responce = new Scanner(System.in);
            System.out.println("Enter cabin number (1-12) or Exit to press X :");
            Main.cabNum = responce.nextInt();
            if (Main.cabNum!=13){

                /** if condition to check the cabin that are already occupied */
                if (Main.ship[Main.cabNum][0].equals("e")) {

                    System.out.println("Enter first name for cabin " + Main.cabNum + " :");
                    Main.cabName = responce.next();
                    Main.ship[Main.cabNum][0]= Main.cabName;
                    Passenger.passenger();
                    System.out.println("!!Customer Added Successfully!!");


                } else {
                    System.out.println("| Cabin is occupied |");
                }
                System.out.println();
            }
            else {
                System.exit(0);
            }

        } catch (Exception e) {
            System.out.println("| Enter a valid cabin number |");
            System.out.println();

        }
    }

    /** Method to delete a customer name from a name */
    public static void DeleteCabin() {
        Scanner responce = new Scanner(System.in);
        System.out.println("Name of the customer you want to delete ? ");
        String Revname = responce.next();

        for (int y = 0; (y < Main.ship.length); y++) {

            for (int z = 0; z <= 4; z++) {
                if (Main.ship[y][0].equals(Revname)) {
                    Main.ship[y][0] = "e";
                    Main.ship[y][1] = "e";
                    Main.ship[y][2] = "e";
                    Main.ship[y][3] = "e";
                    Main.ship[y][4] = "e";
                }

            }
        }
        System.out.println("!!Delete Successfully!!");
    }
    /** Method to find the cabin of a customer */
    public static void FindCabin() {
        Scanner responce = new Scanner(System.in);
        System.out.println("Enter the name you want to find out ? ");
        String findname = responce.next();

        for (int y = 0; (y < Main.ship.length); y++) {

            if (Main.ship[y][0].equals(findname)) {
                System.out.println("Cabin number is " + y);
                System.out.println("Customer surname is = " + Main.ship[y][1]);
                System.out.println("Customer amount is = " + Main.ship[y][2]);
                System.out.println("Adding Customers are = " +Main.ship[y][3] +", "+ Main.ship[y][4]);
            }
        }
        System.out.println();
    }

    /** Method to display available cabin numbers */
    public static void DisplayEmptyCabin() {
        for (int x = 1; x < 13; x++) {
            if (Main.ship[x][0].equals("e")) System.out.println("Cabin " + x + " is empty ");
        }
        System.out.println("...................................................");
    }
}
