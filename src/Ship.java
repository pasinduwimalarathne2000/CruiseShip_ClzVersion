import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ship {
    /**  Method to initialise all the cabins are available */
    public static void initialise(String shipRef[][]) {
        for (int x = 0; x < shipRef.length; x++) {

            for (int y = 0; y < shipRef[x].length; y++) {
                shipRef[x][y] = "e";
            }

        }
    }
    /** Method to save details to a file */
    public static void StoreCabin(String[][] ship) throws IOException {

        FileWriter save = new FileWriter("CabinStore.txt");
        for (int x = 1; x < 13; x++) {

            save.write("\n" +"Cabin "+ x  +"\n"+" -> Customer Name: " + ship[x][0] + "|" +  "|" + "Customer Surname :" + ship[x][1] +
                    "|"+"|"+ " Customer amount :" + ship[x][2]+"|"+"\n"+"Another names : " +ship[x][3] +"| |"+ ship[x][4]);

        }

        System.out.println("!!Successfully Saved Data!! ");
        save.close();
        System.out.println();
    }

    /** Method load details from the file */
    public static void LoadCabin() throws FileNotFoundException {

        FileReader save = new FileReader("CabinStore.txt");
        Scanner readercab = new Scanner(save);
        while (readercab.hasNextLine()) {
            String input = readercab.nextLine();
            System.out.println(input);

        }
        System.out.println("...................................................");
        readercab.close();

        System.out.println();


    }
}
