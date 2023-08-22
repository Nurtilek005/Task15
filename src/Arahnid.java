public class Arahnid extends Animal{
    public Arahnid(String name, int age, String families) {
        super(name, age, families);
    }

    public  void swim(){
        System.out.println("Arahnid swim");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
