public class Turtle extends Animal{
    public Turtle(String name, int age) {
        super(name, age);
    }
    public void  swim(){
        System.out.println(getName()+"  swim");
    }
}
