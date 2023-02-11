import java.util.Locale;
import java.util.Scanner;

public class Main {
    static String cabName,cabSurname,another1,another2;
    static int cabNum = 0;
    static int amount;
    static String[][] ship = new String[13][5];/** adding 2d array */

    /**Main methods and running menu functionalities implemented*/
    public static void main(String[] args) {

        Scanner responce = new Scanner(System.in);
        boolean Q = true;
        Ship.initialise(ship);
        System.out.println();
        System.out.println();
        while (Q) {
            try {
                display();
                System.out.println("Enter the Letter :  ");
                String variable = responce.next().toUpperCase(Locale.ROOT);

                switch (variable) {
                    case "A":
                        Cabin.Add();
                        break;
                    case "V":
                        View();
                        break;
                    case "E":
                        Cabin.DisplayEmptyCabin();
                        break;
                    case "D":
                        Cabin.DeleteCabin();
                        break;
                    case "F":
                        Cabin.FindCabin();
                        break;
                    case "S":
                        Ship.StoreCabin(ship);
                        break;
                    case "L":
                        Ship.LoadCabin();
                        break;
                    case "O":
                        alphabetically();
                        break;
                    case "T":
                        totalExp();
                        break;
                    case "X":
                        Q = false;
                        break;
                    default:
                        System.out.println("| Incorrect input |"); /* If user gives different inputs than these */
                        System.out.println();
                }
            } catch (Exception e) {
                System.out.println("| Letter is incorrect |");

            }

        }
        System.out.println();
    }


    /** Method to display the menu */
    public static void display() {
        System.out.println("````````````````````````````````````````````````````");
        System.out.println("Welcome to Cruise Ship Boarding!!!");
        System.out.println("A: Add a customer to a cabin");
        System.out.println("V: View all cabins");
        System.out.println("E: Display Empty cabin");
        System.out.println("D: Delete customer from cabin");
        System.out.println("F: Find cabin from customer name");
        System.out.println("S: Store program data into file");
        System.out.println("L: Load program data from file");
        System.out.println("O: View passengersOrdered alphabetically by name.");
        System.out.println("T: Total Expenses.");
        System.out.println("X: Exit ");
        System.out.println();
        System.out.println("```````````````````````````````````````````````````");
    }



    /** Method to view already taken cabin */
    public static void View() {
        for (int x = 1; x < ship.length; x++) {
            if (ship[x][0].equals("e")) {
                System.out.println("Cabin " + x + " is empty ");
            } else {
                System.out.println("Cabin " + x + " occupied by " + ship[x][0]);

            }
        }
        System.out.println("...................................................");

    }
    public static void alphabetically(){
        System.out.println("Odered Names : ");
        for (int i=0;i<ship.length;i++){
            System.out.println(ship[i][0]);
        }
    }
    public static void totalExp(){
        for (int x = 0; x < ship.length; x++) {
            if (!ship[x][0].equals("e")) {
                System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++");
                System.out.println("+" + "Cabin " + x);
                System.out.println("+"+"Customer name :" +ship[x][0]);
                System.out.println("+"+"Total amount:" + ship[x][2]);
                System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++");

            }

        }
    }
}
