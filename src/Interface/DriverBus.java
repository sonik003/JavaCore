package Interface;

/**
 * Created by SONI on 15.10.2017.
 */
public class DriverBus implements Transport, Driver {

    private People people;
    private String categoris;
    private int speed = 60;

    @Override
    public void setCategory(String c) {
        this.categoris = c;
        People people = new People("Jon", "Karmak", 23);

    }

    @Override
    public void go() {
        if(people != null){
            System.out.println("Go!!!");
        } else {
            System.out.println("Stop!!");
        }
    }

    @Override
    public int getSpeed() {
        return speed;
    }
}
