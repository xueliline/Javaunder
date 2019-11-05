import java.awt.*;
import java.util.Arrays;
import java.util.EventListener;
import java.util.Timer;

public class lanbdaa {
    public static void main(String[] args) {
        String[] planets = new String[]{"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune"};
        System.out.println(Arrays.toString(planets));
        System.out.println("Sorted in dictionary order:");
        Arrays.sort(planets);
        System.out.println(Arrays.toString(planets));
        System.out.println("Sorted by length:");
        Arrays.sort(planets, (first, second) -> first.length() - second.length());
//        new Thread( () ->{
//            while (true){System.out.println("In lambda, lambda expression rocks !!");}}  ).start();
        new Thread(()-> System.out.println("ddd")).start();
        Even
        Timer t=new Timer(1000,new Event(()-> System.out.println("ddddddddd")));
        System.out.println(Arrays.toString(planets));
    }
}
