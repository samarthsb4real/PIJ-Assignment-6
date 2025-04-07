// Rubber Duck extends Duck
public class RubberDuck extends Duck {
    public RubberDuck() {

        // initailaizing the behaviours
        quackBehaviour = new Squeak();
        swimBehaviour = new Float();
        flyBehaviour = new FlyNoWay();
    }

    @Override
    public void display() {
        System.out.println("I am a Rubber Duck!");
    }
}
