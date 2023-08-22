import java.time.LocalDate;
import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Animal animal = new Shark("Акула", 12, "Водяные Зубчатые");
        Arahnid animal2 = new Arahnid("Паук", 5, "Арахнида");
        Animal animal3 = new Eagle("Орлы", 9, "Летучие хишники");

        Animal[] animals = {animal,animal2, animal3};

        Shark[] sharks = new Shark[1];
        Arahnid[] arahnid = new Arahnid[1];
        Eagle[] eagles = new Eagle[1];

        for (Animal animal4:animals) {
            if(animal4 instanceof Shark){
                sharks[0] = (Shark) animal4;
                System.out.println(sharks[0]);
                ((Shark) animal4).attac();
            }else if(animal4 instanceof Arahnid){
                arahnid[0] = (Arahnid) animal4;
                System.out.println(arahnid[0]);
                ((Arahnid) animal4).swim();
            }else if (animal4 instanceof Eagle){
                eagles[0] = (Eagle) animal4;
                System.out.println(eagles[0]);
                ((Eagle) animal4).fly();
            }
        }
    }
}












