import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class CerealRunner
{
    // create a private instance variable to store an ArrayList of Cereal objects
    private ArrayList<Cereal> cereals;

    public CerealRunner(String fileName)
    {
        // instantiate the ArrayList

        cereals = new ArrayList<Cereal>();

        try
        {
            FileReader fileRdr = new FileReader(fileName);
            Scanner scan = new Scanner(fileRdr);
            while(scan.hasNext())
            {
                String myStr = scan.nextLine();

                // use the split method to parse the data into an array of
                //   String objects

                String[] cereal = myStr.split(",");

                // go through each String array element and save it
                //   into the appropriate variable which will be used to
                //   create a Cereal object

                String name = cereal[0];
int calories = Integer.parseInt(cereal[1]);
double fiber = Double.parseDouble(cereal[2]);
double carbohydrates = Double.parseDouble(cereal[3]);
double cups = Double.parseDouble(cereal[4]);

                // create a new Cereal object, and add it to the ArrayList
                cereals.add(new Cereal(name,calories,fiber,carbohydrates,cups));

            }
            scan.close();


        } catch (FileNotFoundException e)
        {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        int numCereals = cereals.size();
        System.out.println(numCereals + " records created.");
    }

    public static void main(String[] args)
    {
        String fileName = "src/data/cerealSubset.csv";
        CerealRunner cr = new CerealRunner(fileName);
    }

}

