// abstract class for Duck
public abstract class Duck {
    QuackBehaviour quackBehaviour;
    SwimBehaviour swimBehaviour;
    FlyBehaviour flyBehaviour;

    public abstract void display();

    // setter methods for behaviours
    public void setQuackBehaviour(QuackBehaviour quackBehaviour) {
        this.quackBehaviour = quackBehaviour;
    }

    public void setSwimBehaviour(SwimBehaviour swimBehaviour) {
        this.swimBehaviour = swimBehaviour;
    }

    public void setFlyBehaviour(FlyBehaviour flyBehaviour) {
        this.flyBehaviour = flyBehaviour;
    }

    // calling the behaviours
    public void performQuack() {
        quackBehaviour.quack();
    }

    public void performSwim() {
        swimBehaviour.swim();
    }

    public void performFly() {
        flyBehaviour.fly();
    }
}
