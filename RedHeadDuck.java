// Red Head Duck extends Duck
public class RedHeadDuck extends Duck {
    public RedHeadDuck() {

        // initailaizing the behaviours
        quackBehaviour = new Quack();
        swimBehaviour = new Swim();
        flyBehaviour = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("I am a Red Head Duck!");
    }
}
