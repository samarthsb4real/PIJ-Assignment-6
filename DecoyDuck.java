//Decoy Duck extends Duck
public class DecoyDuck extends Duck {
    public DecoyDuck() {

        // initailaizing the behaviours
        quackBehaviour = new MuteQuack();
        swimBehaviour = new Float();
        flyBehaviour = new FlyNoWay();
    }

    @Override
    public void display() {
        System.out.println("I am a Decoy Duck!");
    }
}
