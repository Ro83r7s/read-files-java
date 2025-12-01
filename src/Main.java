import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.channels.ScatteringByteChannel;

public class Main {
    public static void main(String[] args) {

        // How to read a file using Java (3 popular options)

        // BufferedReader + FileReader: Best for reading text files line-by-line
        // FileInputStream: Best for binary files (e.g., images, audio files)
        // RandomAccessFile: Best for read/write specific portions of a large file

        //Creating String variable, naming filepath:
        String filePath = "C:\\Users\\.....\\Documents\\Desktop\\test.txt";
        //combining buffer reader and file reader together
        //creating a buffered reader object:
        //BufferedReader reader = new BufferedReader(new FileReader(filePath));

        try(BufferedReader reader = new BufferedReader(new FileReader(filePath))){
            //System.out.println("That file exists!");
            String line;
            //I want to read that file line by line, I will use While loop
            //during each cycle of the while loop, WITHIN A SET OF PARENTHESES I AM GOING TO
            // SET OUR STRING OF
            // LINE EQUAL TO USE OUR BUFFERED READER OBJECT CALL THE READ LINE METHOD
        while((line = reader.readLine()) != null){//read read each line assign it to this variable of line while there is no lines
            System.out.println(line);
        }
        }
        catch(FileNotFoundException e){
            System.out.println("could not locate file");

        }
        catch(IOException e){
            System.out.println("something went wrong");
        }


    }
}
