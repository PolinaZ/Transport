/**
 * Created by Polina_Z on 03.03.17.
 */
public class Quadricycle extends Transport implements  Do{
    public int Window;

    public int Weel;

    public String Name;

    public int Speed;

    public int Fuel;

    public int Capacity;

    public Quadricycle(int window, int weel, String name, int speed, int fuel, int capacity) {

        this.Window = window;
        this.Weel = weel;
        this.Name = name;
        this.Speed = speed;
        this.Fuel = fuel;
        this.Capacity = capacity;


    }

    public int getWindow() {
        return Window;
    }

    public void setWindow(int window) {
        Window = window;
    }

    public int getWeel() {
        return Weel;
    }

    public void setWeel(int weel) {
        Weel = weel;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getSpeed() {
        return Speed;
    }

    public void setSpeed(int speed) {
        Speed = speed;
    }

    public int getFuel() {
        return Fuel;
    }

    public void setFuel(int fuel) {
        Fuel = fuel;
    }

    public int getCapacity() {
        return Capacity;
    }

    public void setCapacity(int capacity) {
        Capacity = capacity;
    }

    @Override
    public String toString() {
        return "Quadricycle{" +
                "Window=" + Window +
                ", Weel=" + Weel +
                ", Name='" + Name + '\'' +
                ", Speed=" + Speed +
                ", Fuel=" + Fuel +
                ", Capacity=" + Capacity +
                '}';
    }


    @Override
    public String LandPass(Do other) {
        return null;
    }

    @Override
    public String SeatPass(Do other) {
        return null;
    }

}

