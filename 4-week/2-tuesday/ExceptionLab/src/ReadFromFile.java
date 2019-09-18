import java.io.BufferedReader;
import java.io.FileReader;

public class ReadFromFile {
    public static void main(String[] args) {
        String file = "/Users/Ben/Desktop/amex/ga-dev/4-week/2-tuesday/ExceptionLab/src/data.txt";
        try{
            //To open the file object
            FileReader inputFile = new FileReader(file);
            //to obtain content inside the file
            BufferedReader bufferedReader = new BufferedReader(inputFile);
            //to get individual line
            String line;
            //while there are lines to read, read file one line at a time
            while((line = bufferedReader.readLine()) != null){
                System.out.println(line);
            }
            //close the file so no one has access to the memory
            bufferedReader.close();

            //in case of an error, record the error message, so we can exit with zero (succesfully)
        }catch(Exception e){
            //print out error from the exception object e
            System.out.println("Error " + e.getMessage());

        }
    }
}
