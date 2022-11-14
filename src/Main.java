import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = {
                new Shark("shrk", 5),
                new Shark("kit", 5),
                new Turtle("turtle", 4),
                new Turtle("danatella", 4),
                new Eagle("eagle", 3),
                new Eagle("burkyt", 3)
        };
        for (Animal animal : animals) {
            if (animal.getClass().equals(Shark.class))((Shark) animal).attack();
            else if (animal.getClass().equals(Turtle.class))((Turtle) animal).swim();
            else if (animal.getClass().equals(Eagle.class))((Eagle) animal).fly();
            System.out.println(animal);
            }
        Shark[]sharks=new Shark[2];
        Turtle[] turtles=new Turtle[2];
        Eagle[] eagles=new Eagle[2];
        int a=0;
        int b=0;
        int c=0;
        for (Animal animal : animals) {
            if (animal instanceof Shark){
                sharks[a]= (Shark) animal;
                a++;
            } else if (animal instanceof Turtle) {
                turtles[b]=(Turtle) animal;
                b++;

            } else if (animal instanceof Eagle) {
                eagles[c]= (Eagle) animal;
                c++;

            }

        }
        System.out.println(Arrays.toString(sharks));
        System.out.println(Arrays.toString(turtles));
        System.out.println(Arrays.toString(eagles));
        }
        }


