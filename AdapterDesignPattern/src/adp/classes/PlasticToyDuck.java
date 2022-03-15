package adp.classes;

import adp.interfaces.ToyDuck;

public class PlasticToyDuck implements ToyDuck {
    @Override
    public void squeak() {
        System.out.println("Squeak");
    }
}
