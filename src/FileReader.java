import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileReader {
    public static List<String> reader(String filePath){
        List<String> lines = new ArrayList<>();
        File file = new File(filePath);
        try{
            Scanner sc = new Scanner(file);
            while(sc.hasNextLine()){
                lines.add(sc.nextLine());

            }sc.close();

        }catch(FileNotFoundException exception){
            System.out.println(exception.getMessage() + "Nincs ilyen ");
        }return lines;
    }

}
