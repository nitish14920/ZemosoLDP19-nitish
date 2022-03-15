package adp.classes;

import adp.interfaces.Bird;
import adp.interfaces.ToyDuck;

public class BirdAdapter implements ToyDuck {

    Bird bird;

    public BirdAdapter(Bird bird)
    {
        this.bird = bird;
    }

    @Override
    public void squeak() {
        bird.makeSound();
    }
}
