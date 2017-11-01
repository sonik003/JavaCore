package Abstract;

import Abstract.Animals;

/**
 * Created by SONI on 15.10.2017.
 */
public class Cat extends Animals {
    @Override
    public void eat() {
        System.out.println("eat");
    }

    @Override
    public void say() {
        System.out.println("say");
    }
}
