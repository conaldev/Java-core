import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileCSV {
    public static void main(String[] args) {
        String csvFile = "/home/conal/Documents/Module 2/week-4/file.csv";
        String line = "";
        String splitBy = ",";

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            while ((line = br.readLine()) != null) {
                //use comma as separator
                String[] country = line.split(splitBy);
                System.out.println("Country code = " + country[4] + " ,name = " + country[5]);

            }
        }
            catch (IOException e){
            e.printStackTrace();
        }
    }
}
