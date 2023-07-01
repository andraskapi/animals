import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        List<Dog> dogs = new ArrayList<>();
        List<String> lista = FileReader.reader("res/dog.txt");
        for (var line : lista){
            String[] lineAsArray = line.split(",");
            String name = lineAsArray[0];
            int age = Integer.parseInt(lineAsArray[1]);
            String color = lineAsArray[2];

            dogs.add(new Dog(name,age,color));
        }

        for (var actual : dogs){

            System.out.println(actual);
        }
        System.out.println(lista.size());


        List<Chicken> chikens = new ArrayList<>();
        List<String> listOfChickens = FileReader.reader("res/chicken.txt");
        for(var lines : listOfChickens){
            String[] lineAsArray = lines.split(",");
            int eggPerSec = Integer.parseInt(lineAsArray[0]);
            double weight = Double.parseDouble(lineAsArray[1]);

            chikens.add(new Chicken(eggPerSec,weight));

        }
        for(var actual : chikens){
            System.out.println(actual);
        }




    }

}
