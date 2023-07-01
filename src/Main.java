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
        List<Animal> animals = new ArrayList<>();
        animals.addAll(dogs);
        animals.addAll(chikens);
        System.out.println(animals);

        List<Animal> vegyes = new ArrayList<>();
        List<String> vegyesList = FileReader.reader("res/vegyes.txt");
        for(var lines : vegyesList){
            String[] lineAsArray = lines.split(",");
            String type = lineAsArray[0];

            if (type.equals("kutya")){
                String name = lineAsArray[1];
                int age = Integer.parseInt(lineAsArray[2]);
                String color = lineAsArray[3];
                vegyes.add(new Dog(name,age,color));
            } else if (type.equals("csirke")) {
                int eggPerSec = Integer.parseInt(lineAsArray[1]);
                double weight = Double.parseDouble(lineAsArray[2]);
                vegyes.add(new Chicken(eggPerSec,weight));

            }

        }
        System.out.println(vegyes);




    }

}
