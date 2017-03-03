
import java.util.ArrayList;
import java.util.Comparator;

/**
 * Created by Polina_Z on 03.03.17.
 */
public class Main implements Comparator {
    public static void main(String[] args) {

        ArrayList<Car> list = new ArrayList<>();
        Car Lexus = new Car(4, 4, "Lexus NX", 400, 56, 5);
        Car BMW = new Car(4, 4, "BMW 5", 350, 48, 5);
        Car Nissan = new Car(4, 4, "Nissan Teana", 250, 35, 5);

        list.add(Lexus);
        list.add(BMW);
        list.add(Nissan);

       /* Collections.sort(list);
        int i=0;
        for(Car temp: list){
            System.out.println("list " + ++i + " : " + temp);
            */

        ArrayList<Quadricycle> list2 = new ArrayList<>();
        Quadricycle Polaris = new Quadricycle(0, 4, "Polaris", 70, 3, 4);
        Quadricycle Yamaha = new Quadricycle(0, 4, "Yamaha", 90, 4, 4);
        Quadricycle BRP = new Quadricycle(0, 4, "BRP", 85, 6, 4);
        list2.add(Polaris);
        list2.add(Yamaha);
        list2.add(BRP);


        for (Car car : list) {
            if (car.getSpeed() <= 300) {
                System.out.println(car.toString());
            }
        }


        for (Quadricycle quadricycle : list2)
            if (quadricycle.getSpeed() == 80) {
                System.out.println(quadricycle.toString());

            }


    }


    @Override
    public int compare(Object o1, Object o2) {
        return o1.toString().compareTo(o2.toString());
    }
}



